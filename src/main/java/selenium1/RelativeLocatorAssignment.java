package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RelativeLocatorAssignment {

	

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.aqi.in/dashboard/canada");
			
//			WebElement ele=driver.findElement(By.linkText("Alberta"));
//			List<WebElement> eleList=driver.findElements(with(By.tagName("td")).toRightOf(ele));
//			
			
			List<WebElement> eleList2=driver.findElements(By.xpath("//tr[@class='city-list AQI_toggle-1 odd']//th/following-sibling::td"));
			for(WebElement e:eleList2) {
				System.out.println(e.getText());
			}
			
	}

}
