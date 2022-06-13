package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeSearch {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			
			driver.findElement(By.id("search_query_top")).sendKeys("dress");
			Thread.sleep(15000);
			//driver.findElement(By.xpath("//div/ul//li[contains(text(),'Summer Dresses > Printed Chiffon ')]")).click();
			
			//2nd method:By creating webelements...(assignment)
			List<WebElement>suggestionList=driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));
			System.out.println(suggestionList.size());
			for(WebElement e:suggestionList) {
				String text=e.getText();
				System.out.println(text);
				if(text.contains("Casual Dresses > Printed Dress")) {
					e.click();
				}
				
			}
			
	}

}
