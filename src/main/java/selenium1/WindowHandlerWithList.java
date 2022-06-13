package selenium1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithList {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String parentWindowId=driver.getWindowHandle();
//		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
//		
//			Set<String> handles = driver.getWindowHandles();
//			List<String>list=new ArrayList(handles);
//			for(String e:list) {
//				driver.switchTo().window(e);
//				String title=driver.getTitle();
//				System.out.println(title);
//				if(!e.equals(parentWindowId)) {
//				driver.close();
//				}
//				
//			}
//	
		By linkedIn=By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By facebook=By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By twitter=By.xpath("//img[@alt='OrangeHRM on twitter']");
		By youtube=By.xpath("//img[@alt='OrangeHRM on youtube']");
		getOpenWindowFromList(linkedIn,parentWindowId);

	}
	//generic method for the above:
	public static void getOpenWindowFromList(By locator, String parentWindowId) {
		driver.findElement(locator).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String>list=new ArrayList(handles);
		for(String e:list) {
			driver.switchTo().window(e);
			String title=driver.getTitle();
			System.out.println(title);
			if(!e.equals(parentWindowId)) {
			driver.close();
			}
			
		}
		
		
		
	}
	}


