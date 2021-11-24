package assignmentcodesweek3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		alert.accept();
		String youPressedOK = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(youPressedOK);
		
		
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		
	    
	    String x=alert.getText();
		System.out.println(x);
		alert.accept();
		
		driver.findElement(By.id("btn")).click();
		String happyCoding = driver.findElement(By.className("swal-text")).getText();
		System.out.println(happyCoding);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	
		
	}

}
