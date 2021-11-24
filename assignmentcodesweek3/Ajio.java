package assignmentcodesweek3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
@Test
	public  void runAjio() throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
			
				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.ajio.com/");
				
				driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
				
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//label[@for=  'Men']")).click();
				Thread.sleep(2000);

			
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				Thread.sleep(2000);
			
				String totalItems = driver.findElement(By.className("length")).getText();
				System.out.println("Total number of items : " + totalItems);
		        //Get the list of brand of the products displayed in the page and print the list.
				System.out.println(" List of Brands");
				List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
				System.out.println(" Size :" + bagBrandList.size());
						
				ArrayList<String> brandlist=new ArrayList<String>();
				
				for (WebElement we : bagBrandList) {
					String listName = we.getText();
					brandlist.add(listName);
				}
				System.out.println(brandlist);
				
				Set<String> newBag=new TreeSet<String>(brandlist);
				System.out.println(newBag);
				
				
				
				
				
				
				// Get the list of names of the bags and print it
				/*
				 * List<WebElement> bagNameList = driver.findElements(By.className("name"));
				 * 
				 * 
				 * System.out.println(" Size :" + bagNameList.size());
				 * System.out.println(" Names of the Bags"); for (WebElement webElement :
				 * bagNameList) { String text = webElement.getText(); System.out.println(text);
				 * } // TODO Auto-generated method stub
				 */
	}

}
