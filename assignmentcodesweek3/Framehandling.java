package assignmentcodesweek3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framehandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.leafground.com/pages/frame.html");

		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();

		WebElement firstframe = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
		driver.switchTo().frame(firstframe);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[3]"));
		driver.switchTo().frame(frame3);
		driver.switchTo().frame("frame2");

		
		
			}

	}