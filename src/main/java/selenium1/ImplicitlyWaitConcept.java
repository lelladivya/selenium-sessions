package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String appTitle=driver.getTitle();
		System.out.println((appTitle));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("divya");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("divya@gmail.com");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("98989898");
		
		driver.findElement(By.linkText("CONTACT SALES")).click();
		System.out.println(driver.getCurrentUrl());
		//implicitly wait only works for elements on web page.
		//it wont work for getTitle,getCurrentUrl,etc
		//implicitly wait is applied for all the elements of the web page..it is global wait..it should be declared immediately after driver initiaion
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}

}
