package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.findElements(By.xpath("//td[text()='Cary']")).size();
		//we are using findElements to prevent exception if the element is not found on first page
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='Cary']")).size()>0) {
			selectCity("Cary");
			break;
				
			}
			
			else{
				WebElement next = driver.findElement(By.id("tablepress-3_next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("pagination is over");
					break;
				}
				next.click();
				
			}
			Thread.sleep(2000);
		}
		
			
		}

	
	
public static void selectCity(String cityName) {
	driver.findElement(By.xpath("//td[text()='"+cityName+"']/../td/input")).click();
}
}
