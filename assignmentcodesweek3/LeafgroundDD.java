package assignmentcodesweek3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundDD {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

//		Click on this image to go home page
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement findElements1 = driver.findElement(By.xpath("(//select)[5]"));
		findElements1.sendKeys("Selenium",Keys.ENTER);
			
		
		
WebElement findElements = driver.findElement(By.xpath("//select[@class='dropdown']"));
Select dd=new Select(findElements);

WebElement firstSelectedOption = dd.getFirstSelectedOption();
System.out.println(firstSelectedOption.getText());

List<WebElement> options = dd.getOptions();
System.out.println(options.size());

  for(int i=1;i<options.size();i++) {
	  findElements.click();
	  System.out.println(options.get(i).getText());
  

  }
  driver.close();

	}}
