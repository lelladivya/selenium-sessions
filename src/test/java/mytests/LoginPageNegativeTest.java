package mytests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest{
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			{"test12121@gmail.com","test@123"},
			{"naveenanimation20@gmail.com","test@1212"},
			{"test@@gmail.com","test@1212"},
			{" "," "},
			{"!@!@#$","test1212"}		
		};
	}
	@Test(dataProvider="getLoginData")
	public void loginWithWrongData(String userName, String password) {
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
		driver.findElement(By.name("email")).sendKeys("12121212");
		driver.findElement(By.name("password")).sendKeys("12121212");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String text=driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
		Assert.assertTrue(text.contains("Warning: No match for E-Mail Address and/or Password."));
	}

}
