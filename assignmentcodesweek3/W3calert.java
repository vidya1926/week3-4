package assignmentcodesweek3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3calert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //WebElement Frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame("iframeResult");	
      driver.findElement(By.xpath("//button[text()='Try it']")).click();
      Alert alert=  driver.switchTo().alert();
      String y= alert.getText();
     System.out.println(y);   
     alert.accept();
      
     String text = driver.findElement(By.xpath("//*[@id='demo']")).getText();
     System.out.println(text);
     	}

}
