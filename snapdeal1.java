package seleniumSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * ChromeDriver driver=new ChromeDriver(); ChromeOptions Options=new
		 * ChromeOptions(); Options.addArguments("--disable-notification");
		 * 
		 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 * driver.get("https://www.snapdeal.com"); driver.manage().window().maximize();
		 * Actions actions = new Actions(driver); WebElement target =
		 * driver.findElement(By.xpath(
		 * "//li[text()='More Categories']/following-sibling::li//span"));
		 * actions.moveToElement(target).perform();
		 * driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click(); String
		 * items =
		 * driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText
		 * (); System.out.println("The count of the sports shoes  :" +items);
		 * 
		 * driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		 * 
		 * String tshoe = driver.findElement(By.className("category-count")).getText();
		 * System.out.println(tshoe);
		 * 
		 * List<WebElement> shoeList =
		 * driver.findElements(By.xpath("//p[@class='product-title']")); List<String>
		 * shonename=new ArrayList<String>(); for (int i = 0; i < shoeList.size(); i++)
		 * { 
		 * String text = shoeList.get(i).getText();
		 * 
		 * // System.out.println(text); shonename.add(text); }
		 * Collections.sort(shonename); System.out.println(shonename);
		 */
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		WebElement movetoshirt = driver.findElement(By.xpath("//li[@class='navlink lnHeight']//span[@class='catText'][1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(movetoshirt).perform();
		
	    driver.findElement(By.xpath("(//span[text()='Shirts'])[2]")).click();

		WebElement firstsel = driver.findElement(By.xpath("//span[@class='lfloat product-desc-price strike ']"));
		
		builder.moveToElement(firstsel).perform();
		WebElement clickquick = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
		builder.moveToElement(clickquick).perform();
		clickquick.click();
		driver.quit();
	}

}
