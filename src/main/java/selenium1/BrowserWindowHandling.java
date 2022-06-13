package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandling {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set <String>handles=driver.getWindowHandles();
		
		Iterator <String> it=handles.iterator();
		String parentWindowId=it.next();
		System.out.println("parentWindowId");
		String childWindowId=it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		driver.switchTo().window(parentWindowId);
	
		
		
		

	}

}
