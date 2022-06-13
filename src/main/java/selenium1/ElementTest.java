package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementTest {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
//		BrowserUtil brUtil=new BrowserUtil();
//		
//		brUtil.init_driver("chrome");
//		brUtil.navigateUrl("https://opensource-demo.orangehrmlive.com/");
//		System.out.println(brUtil.getPageTitle());
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		//1st way:
		//driver.findElement(By.id("input-email")).sendKeys("divya@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2nd way:
		
//		WebElement emailId =driver.findElement(By.id("input-email"));
//		WebElement password =driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("divya@gmail.com");
//		password.sendKeys("test@123");
		
		
		//3rdway:
		
//		By email=By.id("input-email");
//		By pwd=By .id("input-password");
//		
//		WebElement emailId =driver.findElement(email);
//		WebElement password =driver.findElement(pwd);
//		
//		emailId.sendKeys("divya@gmail.com");
//		password.sendKeys("test@123");
//		
		//4th way:
//		By email=By.id("input-email");
//		By pwd=By .id("input-password");
//		
//		getElement(email).sendKeys("divya@gmail.com");
//		getElement(pwd).sendKeys("test@123");
		
		
		//5th method:
//		By email=By.id("input-email");
//		By pwd=By .id("input-password");
//		
//		sendKeys(email,"divya@gmail.com");
//		sendKeys(pwd,"test@123" );
//		
	//	6th method:
//		
//		By email=By.id("input-email");
//		By pwd=By .id("input-password");
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		
//		eleUtil.doSendKeys(email, "divya@gmail.com");
//		eleUtil.doSendKeys(pwd, "test@123");
//		
		//7th method:
//		String emailId="input-email";
//		String pwd="input-password";
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		
//		eleUtil.doSendKeys(eleUtil.getBy("id",emailId),"divya@gmail.com");
//		eleUtil.doSendKeys(eleUtil.getBy("id",pwd),"test@123");
//		
		
		
		By FirstName=By.id("input-firstname");
		By LastName=By.id("input-lastname");
		By Email=By.id("input-email");
		By Phone=By.id("input-telephone");
		
		By pwd=By.id("input-password");
		By confirmPwd=By.id("input-confirm");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.doSendKeys(FirstName, "Divya");
		eleUtil.doSendKeys(LastName, "Lella");
		eleUtil.doSendKeys(Email, "divya@gmail.com");
		eleUtil.doSendKeys(Phone, "9898989898");
		eleUtil.doSendKeys(pwd, "test@123");
		eleUtil.doSendKeys(confirmPwd, "test@123");
		
		
		
		
		
		
		}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//		
//	}
//	public static void sendKeys(By locator,String value) {
//		
//		getElement(locator).sendKeys(value);
//		
		
		
		
		
		
		
		
	}


