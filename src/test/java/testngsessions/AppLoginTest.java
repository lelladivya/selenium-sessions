package testngsessions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLoginTest {
WebDriver driver;
	@BeforeMethod
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.opencart.com/index.php?route=account/login");
	}
	
	@Test
	public void titleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
		
	}
	@Test
	public void urlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("route=account/login"));
	}
	@Test
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
		
	}
	
	
}

