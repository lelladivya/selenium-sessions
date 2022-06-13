package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshworksFooterLinks {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//freshworks.com
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		Thread.sleep(5000);
//		List<WebElement>footerLinks=driver.findElements(By.xpath("//footer//div[@class='row']//ul[@class='footer-nav']/li"));
//		System.out.println(footerLinks.size());
//		for(WebElement e:footerLinks) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("Leadership")) {
//				
//			e.click();
//			break;
//			}
//			 
//			}
		By footerList=By.xpath("//footer//div[@class='row']//ul[@class='footer-nav']/li");
		//clickOnElementFromSection(footerList,"Leadership");
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.clickOnElementFromSection(footerList, "Leadership");

		
	}
	public static void clickOnElementFromSection(By locator,String value) {
		List<WebElement>eleList=driver.findElements(locator);
		for(WebElement e:eleList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				
				e.click();
			break;
			}
			 
			}
		
		
	}
	
	}
