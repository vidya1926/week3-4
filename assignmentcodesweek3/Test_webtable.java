package assignmentcodesweek3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_webtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //WebElement ele1 = driver.findElement(By.xpath("//td[text()='Market Share']"));
       //String ms = ele1.getText();
       //System.out.println("The values of "+ms);
       WebElement table = driver.findElement(By.xpath("//caption[text()='The Three Most Popular JavaScript Libraries']/parent::table"));
       java.util.List<WebElement> tablerow=table.findElements(By.tagName("tr"));
       WebElement firstrow=tablerow.get(1);
       java.util.List<WebElement> cols=firstrow.findElements(By.tagName("td"));
       for(WebElement each:cols)
       {
    	   String values=each.getText();
    	   System.out.println(values);
       }
       java.util.List<WebElement> tablerow2=table.findElements(By.tagName("tr"));
       WebElement secondrow=tablerow2.get(2);
       java.util.List<WebElement> cols1=secondrow.findElements(By.tagName("td"));
       for(WebElement each:cols1)
       {
    	   String values1=each.getText();
    	   System.out.println(values1);  
       }
       driver.close();
	}

}
