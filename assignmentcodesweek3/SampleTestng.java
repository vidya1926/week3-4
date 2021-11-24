package assignmentcodesweek3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestng {
	@Test
	public void runLogin() throws IOException {
		FileInputStream fis=new FileInputStream("./src/main/resources/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
		 
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	
		
		
	}
}
