package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
			By country=By.xpath("//select[@id='Form_submitForm_Country']/option");
			By state=By.xpath("//select[@id='Form_submitForm_State']/option");
//			List <WebElement> countryEle=driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
//			List <WebElement> stateEle=driver.findElements(By.xpath("//select[@id='Form_submitForm_State']/option"));
//			for(WebElement e:countryEle) {
//				String text=e.getText();
//				System.out.println(text);
//				if(text.contains("India")) {
//					e.click();
//					break;
//				}
//			}
//			Thread.sleep(5000);
//			for(WebElement e:stateEle) {
//				String text1=e.getText();
//				System.out.println(text1);
//				if(text1.contains("Goa")) {
//					e.click();
//					break;
//				}
//			}
			selectValueFromDropDown(country,"India");
			Thread.sleep(5000);
			selectValueFromDropDown(state,"Goa");
			
	}
	//utility for the above:
	public static void selectValueFromDropDown(By locator,String value) {
		 List<WebElement> optionsList=driver.findElements(locator);
		 System.out.println(optionsList.size());
		 for(WebElement e:optionsList) {
				String text=e.getText();
				System.out.println(text);
				if(text.contains(value)) {
					e.click();
					break;
				}
			}
		 
	}

}
