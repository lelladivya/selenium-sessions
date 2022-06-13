package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCart {

	public static void main(String[] args) {
		WebDriver driver;
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.init_driver("chrome");
		
		
		brUtil.navigateUrl("https://demo.opencart.com/index.php?route=account/login");
		
		String title=brUtil.getPageTitle();
		System.out.println(title);
		By pwd= By.name("password");
		By email=By.id("input-email");
		By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By warnMsg=By.className("alert-danger");
		By loginPage=By.linkText("Login");

		By register=By.linkText("Register")	;
		
				
		By firstName=By.id("input-firstname");
		By lastName=By. name("lastname");
		By email2=By. xpath("//*[@id=\"input-email\"]")	;
		By phone =By.cssSelector("#input-telephone");
		By password=By.id("input-password");
		By conpassword=By.id("input-confirm");
		By checkBox= By.name("agree");
		By continueBtn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By alertMsg=By.className("alert-dismissible");
		ElementUtil eleUtil=new ElementUtil(driver);
		
		
		eleUtil.doSendKeys(email,"divya@gmail.com" );	
		eleUtil.doSendKeys(pwd,"test@123" );
		eleUtil.doClick(login);
		String warnText=eleUtil.doGetElementText(warnMsg);
		System.out.println(warnText);
//		
		eleUtil.doClick(register);
		eleUtil.doSendKeys(firstName, "Divya");
		eleUtil.doSendKeys(lastName, "Lella");
		eleUtil.doSendKeys(email2, "divya11@gmail.com");
		eleUtil.doSendKeys(phone, "9898989898");
		eleUtil.doSendKeys(password, "divya");
		eleUtil.doSendKeys(conpassword, "divya");
		eleUtil.doClick(checkBox);
		eleUtil.doClick(continueBtn);
		System.out.println(eleUtil.doGetElementText(alertMsg));	
		
		eleUtil.doClick(loginPage);
		
		
//				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	}

}
