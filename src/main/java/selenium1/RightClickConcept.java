package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightCllickMe=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightCllickMe).perform();
		
		List<WebElement>rightClicklist=driver
				.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
		List<String>list=new ArrayList();
		for(WebElement e:rightClicklist) {
			String text=e.getText();
			System.out.println(text);
			list.add(text);
			e.click();
		Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			act.contextClick(rightCllickMe).perform();
			

//			
		}
		System.out.println(list);
//			
//			
//		}
	}

}
