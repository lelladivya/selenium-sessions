package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By firstName=By.id("Form_submitForm_Name");
		By email=By.id("Form_submitForm_Email");
		By contact=By.id("Form_submitForm_Contact");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		WebElement name=wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
//		name.sendKeys("divya");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("divya@gmail.com");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("98989898");
		
		
		

	}
	//utility:
	public static void waitForElementPresent(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		WebElement name=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static void waitForElementVisible(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		WebElement name=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

}
