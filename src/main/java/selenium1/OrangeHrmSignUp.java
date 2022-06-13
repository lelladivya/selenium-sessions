package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmSignUp {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver = brUtil.init_driver("chrome");
		brUtil.navigateUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		brUtil.getPageTitle();
		
		ElementUtil eleUtil=new ElementUtil(driver);
		By fullName=By.id("Form_submitForm_Name");
		By email=By.id("Form_submitForm_Email");
		By phoneNumber=By.id("Form_submitForm_Contact");
		By submit=By.id("Form_submitForm_action_request");
		By url=By.id("Form_submitForm_subdomain");
		
		eleUtil.doSendKeys(fullName, "Divya lella");
		eleUtil.doSendKeys(email, "Divya@gmail.com");
		eleUtil.doSendKeys(phoneNumber, "9898989898");
		//isDisplayed():
		System.out.println(eleUtil.doIsDisplayed(submit));
		
		//getAttribute():
		
		System.out.println(eleUtil.doGetAttribute(url, "placeholder"));

	}

}
