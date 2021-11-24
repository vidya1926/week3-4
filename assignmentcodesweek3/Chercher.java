package assignmentcodesweek3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chercher {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

// Type Topic inside a frame		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("TestLeaf");

//Select CheckBox inside a frame
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();

// Select by dropDown inside a frame		
		driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select select = new Select(animal);

	 // select.selectByIndex(1);
	 // select.selectByValue("big baby cat");
		select.selectByVisibleText("Avatar");

		driver.switchTo().defaultContent();
		}
		}		


