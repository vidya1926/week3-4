package assignmentcodesweek3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click(); 
		
	Set<String>	windowsOpened=driver.getWindowHandles();
	System.out.println(windowsOpened.size());
	
	for(String windows:windowsOpened)
	{
		System.out.println(windows);
			
	}
	List<String> winList=new ArrayList<String>(windowsOpened);
	
	driver.switchTo().window(winList.get(1));
	
	String title = driver.getTitle();
	
	System.out.println(title);
}
}
