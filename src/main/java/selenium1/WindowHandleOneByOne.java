package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleOneByOne {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
//
//		Set<String> handles = driver.getWindowHandles();
//
//		Iterator<String> it = handles.iterator();
//		String parentWindowId = it.next();
//		String childWindowId = it.next();
//
//		driver.switchTo().window(childWindowId);
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.close();
//		driver.switchTo().window(parentWindowId);
		By linkedIn=By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By facebook=By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By twitter=By.xpath("//img[@alt='OrangeHRM on twitter']");
		By youtube=By.xpath("//img[@alt='OrangeHRM on youtube']");
		getWindowOpen(linkedIn);
		getWindowOpen(facebook);
		getWindowOpen(twitter);
		getWindowOpen(youtube);

	}

	// generic method for opening windows one after other:
	public static void getWindowOpen(By locator) {
		driver.findElement(locator).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();

		driver.switchTo().window(childWindowId);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(parentWindowId);

	}

}
