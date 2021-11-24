package assignmentcodesweek3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableAdvanced {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/sorttable.html");
		
		driver.manage().window().maximize();
		
		List <WebElement> name=driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
		ArrayList<String> webname=new ArrayList<String>();
		for(WebElement table:name)
		{
			String weblist= table.getText();
			webname.add(weblist);
		}
		System.out.println(webname);
		Collections.sort(webname);
		driver.findElement(By.xpath("//th[text()='Name']")).click();
		
		List <WebElement> name1=driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
		ArrayList<String> webname1=new ArrayList<String>();
		for(WebElement table1:name1)
		{
			String weblist1= table1.getText();
			webname1.add(weblist1);
		}	
		
		System.out.println(webname1);
		Collections.sort(webname1);
		System.out.println(webname1);
		
		
		
		if(webname.equals(webname1))
		
		{
			System.out.println("Both table values are equal");
		}
		else
			System.out.println("Both table values are equal");
	}


}