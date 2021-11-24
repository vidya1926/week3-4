package assignmentcodesweek3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {
@Test
	public void test1() {
//System.setProperty("webdriver.chrome.driver.","./driver/chromedriver.exe");
WebDriverManager.chromedriver().setup();
	String property = System.getProperty("webdriver.chrome.driver", "path");
System.out.println(property);
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	

	}

}
