package assignmentcodesweek3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class servicenow {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
//driver.get("https://dev113175.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev87778.service-now.com/navpage.do");
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Sra@1234");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Incident",Keys.ENTER);
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[text()='Create New']")).click();
		
		/*
		 * driver.switchTo().frame(0); //
		 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(null))
		 * 
		 * driver.findElement(By.id("user_name")).sendKeys("admin");
		 * 
		 * driver.findElement(By.id("user_password")).sendKeys("Vidya12#");
		 * driver.findElement(By.id("sysverb_login")).click();
		 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(
		 * "filter")))); driver.findElement(By.id("filter")).sendKeys("incident");
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//div[text()='Create New']")).click();
		 * driver.switchTo().frame("gsft_main");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "//button[@id='lookup.incident.caller_id']//span[1]")).click();
		 * 
		 * Set<String> allwindow = driver.getWindowHandles(); List<String> window1 = new
		 * ArrayList<String>(allwindow); driver.switchTo().window(window1.get(1)); //
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
		 * System.out.println(driver.getWindowHandles().size());
		 * driver.switchTo().window(window1.get(0));
		 * driver.switchTo().frame("gsft_main");
		 * 
		 * String incidentnumber =
		 * driver.findElement(By.id("incident.number")).getAttribute("value");
		 * System.out.println(incidentnumber);
		 * 
		 * driver.findElement(By.id("incident.short_description")).
		 * sendKeys("Learning Window  Handling");
		 * 
		 * 
		 * driver.findElement(By.id("lookup.incident.short_description")).click();
		 * 
		 * Set<String> allwindow1 = driver.getWindowHandles(); List<String> window2 =
		 * new ArrayList<String>(allwindow1); driver.switchTo().window(window2.get(1));
		 * 
		 * driver.findElement(By.linkText("Issue with a web page")).click();
		 * 
		 * driver.switchTo().window(window2.get(0));
		 * 
		 * driver.switchTo().frame("gsft_main");
		 * driver.findElement(By.xpath("//button[text()='Submit']")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(
		 * "INC0018587", Keys.ENTER);
		 * driver.findElement(By.xpath("(//a[contains(@class,'btn btn-icon')])[2]")).
		 * click(); String numberCall =
		 * driver.findElement(By.xpath("(//div[@role='region'])[3]")).getText(); File
		 * screenshotAs = driver.getScreenshotAs(OutputType.FILE); File file = new
		 * File("./demo/snap1.jpg"); FileUtils.copyFile(screenshotAs, file);
		 * 
		 * System.out.println("The incident created successfully"); // TODO
		 * 
		 * driver.close();
		 */
	}

}
