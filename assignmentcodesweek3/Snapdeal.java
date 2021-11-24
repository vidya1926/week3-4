package assignmentcodesweek3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
  WebDriverManager.chromedriver().setup();
		
		ChromeOptions options= new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 ChromeDriver driver=new ChromeDriver(options);
		 System.setProperty("webdriver.chrome.silentOutput", "true");
		 
	//Maximize the browser
		 driver.manage().window().maximize();
	//Load the url
		 driver.get("https://www.snapdeal.com/ ");
	//Implicitly wait for 5 milliseconds
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//li[@class='navlink lnHeight']//span")).click();
		 driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		 driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		 WebElement slider = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll left-handle')]"));
		 Dimension size =slider.getSize();
		 int width=size.getWidth();
		 System.out.println(width);
		 
			String value=slider.getAttribute("style");
			System.out.println(value);
			String repalce=value.replaceAll("\\D", "");
			System.out.println(repalce);
			int x=Integer.parseInt(repalce);
		 Actions slide=new Actions(driver);
		 slide.clickAndHold().dragAndDropBy(slider, x+10, 0).release(slider).perform();
				 
		 
		

			
				
		 
		 
		 
		 
		 
		 
	}
	}

