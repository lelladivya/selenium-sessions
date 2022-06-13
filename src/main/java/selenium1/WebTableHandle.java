package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath.practice.page/");
		driver.findElement(By.xpath("//a[text()='John.Smith']/../preceding-sibling::td/input")).click();
		List<WebElement>details=driver.findElements(By.xpath("//a[text()='John.Smith']/parent::td/following-sibling::td"));
		List<String>detailsList=new ArrayList();
		for(WebElement e:details) {
			String text=e.getText();
			detailsList.add(text);
			
		}
		System.out.println(detailsList);
		
		selectUser("Jordan.Mathews");
		selectUser("Garry.White");

		selectUser("Jasmine.Morgan");

		selectUser("Joe.Root");
		selectUser("Kevin.Mathews");
		
		System.out.println(getUserData("Jordan.Mathews"));
		System.out.println(getUserData("Garry.White"));

		System.out.println(getUserData("Jasmine.Morgan"));

		System.out.println(getUserData("Joe.Root"));
		System.out.println(getUserData("Kevin.Mathews"));

		

	}
	
	//utilities for the above:
	//
	public static void selectUser(String name) {
		driver.findElement(By.xpath("//a[text()='"+name+"']/../preceding-sibling::td/input")).click();
	}
		
	public static List<String> getUserData(String name) {
		List<WebElement>details=driver.findElements(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td"));
		List<String>detailsList=new ArrayList();
		for(WebElement e:details) {
			String text=e.getText();
			detailsList.add(text);
			
		}
		return detailsList;
	}
		
		
		
	}
		
		

		
	
	


