package assignmentcodesweek3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa_LOrealparisnew {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// open https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// MouseOver on Brands and MouseOver on popular
		WebElement Brands = driver.findElement(By.xpath("//a[text()='brands']"));
		WebElement Popular = driver.findElement(By.xpath("//a[text()='Popular']"));

		Actions builder = new Actions(driver);
		builder.moveToElement(Brands).perform();
		Thread.sleep(3000);
		builder.moveToElement(Popular).perform();

		// Click L'Oreal Paris
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']"))
				.click();

		String title = driver.getTitle();
		if (title.contains("L'Oreal Paris"))
			System.out.println(title);
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)");
		 
		
         
        
		
		  // 5) Click sort By and select customer top rated Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[@class='pull-left']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		  
		  // 6) Click Category and click Shampoo Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[text()='Category']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("th//div[@class='filter-options-toggle'])[1]")).
		  click();
		  driver.findElement(By.xpath("//div[@class='filter-options-toggle'])[2]")).
		  click(); WebElement Sampoo =
		  driver.findElement(By.xpath("//div[@class='control__indicator'])[1]"));
		  
		  Sampoo.click(); boolean selected = Sampoo.isSelected();
		  System.out.println(selected);
		  
		  // 7) check whether the Filter is applied with Shampoo
		  String filter =
		  driver.findElement(By.xpath("//li[text()='Shampoo']")).getText(); if
		  (filter.contains("Shampoo")) System.out.println("Filter applied: " + filter);
		  
		  // 8) Click on L'Oreal Paris Colour Protect Shampoo Thread.sleep(3000);
		  driver.findElement(By.
		  xpath("//span[contains(text(),'Colour Protect Shampoo')])[1]")).click();
		  
		  // 9) Go to the new window and select size as 360ml 
		  Set<String> winSet1 =
		  driver.getWindowHandles(); List<String> winList1 = new
		  ArrayList<String>(winSet1); 
		  driver.switchTo().window(winList1.get(2));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[text()='360ml']")).click();
		  Thread.sleep(5000);
		  
		  // 10) Print the MRP of the product 
		  String mrp = driver.findElement(By.xpath(
		  "//span[@class='post-card__content-price-offer'])[1]")).getText(); 
		  mrp =
		  mrp.replaceAll("\\D", ""); int mrp1 = Integer.parseInt(mrp);
		  System.out.println("MRP of the produce: " + mrp1);
		  
		  // 11) Click on ADD to BAG Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[text()='ADD TO BAG'])[1]")).click();
		  
		  // 12) Go to Shopping Bag Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
		  
		  // 13) Print the Grand Total amount 
		  String grandtotal =
		  driver.findElement(By.xpath("//div[@class='value'])[4]")).getText();
		  grandtotal = grandtotal.replaceAll("\\D", ""); int gt1 =
		  Integer.parseInt(grandtotal); System.out.println("Grand Total: " + gt1);
		  
		  // 14) Click Proceed Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='second-col']/button")).click();
		  
		  // 15) Click on Continue as Guest Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@class='btn full big']")).click();
		  
		  // 16) Check if this grand total is the same in step 13
		  
		  String grandtotal2 =
		  driver.findElement(By.xpath("(//div[@class='value'])[2]/span")).getText();
		  grandtotal2 = grandtotal2.replaceAll("\\D", ""); int gt2 =
		  Integer.parseInt(grandtotal2); System.out.println("Grand Total: " + gt2);
		  
		  if (gt1 == gt2) { System.out.println("Both are same");
		  
		  } else { System.out.println("Both are not same"); }
		  
		  // // 17) Print the warning message (delay in shipment) //
		  WebElement
		  warn_msg =
		  driver.findElement(By.xpath("(//div[contains(@class,'message ')])[1]")); //
		  String warning = warn_msg.getText(); //
		  System.out.println("Warning Message: " + warning);
		  
		  // 18) Close all windows driver.quit();)
		 
	}

}
