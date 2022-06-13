package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownOptions {

	
		static WebDriver driver;

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
			WebElement state=driver.findElement(By.id("Form_submitForm_State"));
			Select select=new Select(country);
			select.selectByValue("India");
			
			By countryEle=By.id("Form_submitForm_Country");
			By stateEle=By.id("Form_submitForm_State");
			System.out.println(getSelectDropDownOptionsCount(countryEle));
			
			
			Select select1=new Select (state);
			List <WebElement> countryList=select.getOptions();
			List <WebElement> stateList=select1.getOptions();
			System.out.println(countryList.size());
			System.out.println(stateList.size());
			//***imp interview question :how to click on particular option from select dropdown without using select class index or visible text or value?
			for(WebElement e:countryList) {
				String Text=e.getText();
				System.out.println(Text);
				if(Text.contains("India")) {
					e.click();
					break;
				}
				
			}
			for(WebElement e:stateList) {
				String Text=e.getText();
				System.out.println(Text);
				if(Text.contains("Goa")) {
					e.click();
					break;
					
				}
			}
			
		
	}
		
		//utilities for the above:
		public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		}
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
			}
		public static int getSelectDropDownOptionsCount(By locator) {////ask sir
			//return getElements(locator).size();
			Select select=new Select(getElement(locator));
			List <WebElement> optionsList=select.getOptions();
			return optionsList.size();
		}
		public static void printSelectDropDownValues(By locator) {
			Select select=new Select(getElement(locator));
			List <WebElement> optionsList=select.getOptions();
			System.out.println(optionsList.size());
			for(WebElement e:optionsList) {
				String text=e.getText();
				System.out.println(text);
			}
		}
		
		public static void selectValueFromSelectDropDown(By locator,String value) {
			Select select=new Select(getElement(locator));
			List <WebElement> optionsList=select.getOptions();
		
			for(WebElement e:optionsList) {
				String Text=e.getText();
				System.out.println(Text);
				if(Text.contains("India")) {
					e.click();
					break;
			
				}
			}
		}
		public static List<String> getSelectDropDownValuesList(By locator) {
			List<String>valuesList=new ArrayList<String>();
			Select select=new Select(getElement(locator));
			List <WebElement> optionsList=select.getOptions();
		
			for(WebElement e:optionsList) {
				String Text=e.getText();
				valuesList.add(Text);
			
			}
			return valuesList;	
			
		}
}
