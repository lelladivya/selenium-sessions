package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestion {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By .name("q")).sendKeys("naveen automation labs");
		Thread.sleep(5000);
//		List <WebElement>searchSuggestionList=driver.findElements(By.xpath("//div[@class='mkHrUc']//ul[@class='erkvQe']//li[@class='sbct']"));
//		System.out.println(searchSuggestionList.size());
//		for(WebElement e:searchSuggestionList) {
//			String suggestionList=e.getText();
//		
//			System.out.println(suggestionList);
//			if(suggestionList.contains("naveen automationlabs mock interview")) {
//				e.click();
//				break;
//				
//			}
			
			
	//	}
		
		//2nd method: without creating webelement and for clicking on specific suggestion.(assignment)
		driver.findElement(By.xpath("//div[@class='eIPGRd']//b[contains(text(),' interview questions')]")).click();
		
		
		
		
		
		
		
		

	}

}
