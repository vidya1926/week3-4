package assignmentcodesweek3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubts {


	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver driver= new ChromeDriver();
	    
	    //Load the Url
	    driver.get("http://www.leafground.com/pages/checkbox.html");
	    
	    //Maximize the webpage
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//label[@for='java']/following::input[2]")).click();
	    
	 List<WebElement> options= driver.findElements(By.xpath("//div[text()='Option']/input"));
	 for (int i = 1; i <= options.size(); i++) {
			driver.findElement(By.xpath("//div[text()='Option " + i +"]input")).click();
	
	 
	 
	 }}

}
