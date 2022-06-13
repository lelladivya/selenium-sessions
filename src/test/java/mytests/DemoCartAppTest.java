package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoCartAppTest extends BaseTest {
	
	
	@Test(priority=1)
	public void TitleTest() {
		

		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
		
	}
	@Test(priority=2)
	public void urlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("route=account/login"));
		
	}
	@Test(priority=3)
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}
	
	

}
