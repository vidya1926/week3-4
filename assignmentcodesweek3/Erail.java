package assignmentcodesweek3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		// driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement sortOnDate = driver.findElement(By.id("chkSelectDateOnly"));
		boolean enabledsortOnDate = sortOnDate.isEnabled();
		if (enabledsortOnDate == true) {
			System.out.println("Unchecking the sort on Date");
			sortOnDate.click();
		} else {
			System.out.println("Sort on Date is already Unchecked");
		}

		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai", Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Coimbatore", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> trainName = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		System.out.println(trainName.size());
		String text = trainName.get(0).getText();
		
		
        System.out.println(text);
		ArrayList<String> tname = new ArrayList<String>();
		
	
		
		for (WebElement we : trainName) {
			String listName = we.getText();
			tname.add(listName);
		}
		System.out.println(tname);
		Collections.sort(tname);
		System.out.println("The Sorted List");
		System.out.println(tname);

		
	}

}
