package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTogether {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator <String> it=handles.iterator();
		
		while(it.hasNext()) {
			String windowId=it.next();
			driver.switchTo().window(windowId);
			driver.getTitle();
//			if(windowId.equals(parentId)) {
//				continue;
//			}
//			else {
//			driver.close();
//			}
			if(!windowId.equals(parentId)) {
				driver.close();
			}
		}
			
		}
//		String orangeId=it.next();
//		String linkedInId=it.next();
//		String facebookId=it.next();
//		String twitterId=it.next();
//		String youtubeId=it.next();
//		
//		driver.switchTo().window(linkedInId);
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(facebookId);
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(twitterId);
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(youtubeId);
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(orangeId);
//		System.out.println(driver.getTitle());
//		
//
//	}
	
		
	}
	


