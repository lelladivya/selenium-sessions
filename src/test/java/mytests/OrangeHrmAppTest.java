package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmAppTest extends BaseTest {

	@Test
	public void hrmTitleTest() {

		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Orange HRM");
		
	}
	@Test
	public void hrmUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm-30-day-trial/"));
		
	}
	
	

}
