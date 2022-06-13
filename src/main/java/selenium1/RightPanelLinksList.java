package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//demo.opencart.com

public class RightPanelLinksList {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	//	List<WebElement>rightPanelLinks=driver.findElements(By.xpath("//aside[@id='column-right']/div/a"));
	//	System.out.println(rightPanelLinks.size());
//		for(WebElement e:rightPanelLinks) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("Register")) {
//				
//			e.click();
//			break;
//			}
//			 
//			}
		By rightPanelLinks=By.xpath("//aside[@id='column-right']/div/a");
		printAllElementsList(rightPanelLinks);
		System.out.println(getElementsTextList(rightPanelLinks));
		System.out.println(getElementsListCount(rightPanelLinks));
		
		
		

	}
	public static void printAllElementsList(By locator) {
		
		List<WebElement>eleList=driver.findElements(locator);
		
		for(WebElement e:eleList) {
			String text=e.getText();
			System.out.println(text);
		}
			
		}
			
	public static int getElementsListCount(By locator) {
		List<WebElement>eleList=driver.findElements(locator);
		return eleList.size();
		
	}
	public static List<String> getElementsTextList(By locator) {
		List<String>eleTextList=new ArrayList<String>();
		
		
		List<WebElement>eleList=driver.findElements(locator);
		
		for(WebElement e:eleList) {
			String text=e.getText();
			eleTextList.add(text);
			
		}
			return eleTextList;
		
	}
		
		
	
		
		
	

}
