package assignmentcodesweek3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// open https://www.nykaa.com/
		driver.get("https://www.myntra.com/");
		driver.findElement(By.linkText("Best Sellers")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement menClick=driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
	Actions builder=new Actions(driver);
	builder.moveToElement(menClick).perform();
	
	}

}
