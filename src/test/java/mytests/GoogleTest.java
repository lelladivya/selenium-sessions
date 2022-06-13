package mytests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleTest extends BaseTest {
	
	@Test
	public void googleTitleTest() {
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		
	}
	@Test
	public void googleUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
		
	}
	
	
	
	

}
