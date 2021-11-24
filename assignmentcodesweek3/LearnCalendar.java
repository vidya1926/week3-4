package assignmentcodesweek3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCalendar {
@Test
	public void calendar() {
	 String pickDate="March 2019";
	 String date="3";
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();

//	Click on this image to go home page
	driver.get("http://www.leafground.com/pages/Calendar.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("datepicker")).click();
	//Check for the Expected month
	while(true) {
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		if(month.equals(pickDate))
		{
			break;
		}
		else {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		
		}
	
	
	
	
	
	
	}

	
   
   
	}
	

