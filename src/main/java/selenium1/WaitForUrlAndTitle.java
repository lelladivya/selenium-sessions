package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrlAndTitle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.linkText("CONTACT SALES")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if (wait.until(ExpectedConditions.titleContains("Contact"))) {
			System.out.println(driver.getTitle());
		}

	}
	public static String waitForTitleContains(String titleFraction,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleContains("titleFraction"))) {
			return driver.getTitle();
		}
		return null;
		
	}
	public static String waitForTitleIS(String title,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleContains("title"))) {
			return driver.getTitle();
		}
		return null;
		
	}
	public static String waitForUrlContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.urlContains("urlFraction"))) {
			return driver.getCurrentUrl();
		}
		return null;
		
	}
	public static String waitForUrlIs(String url,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.urlToBe("url"))) {
			return driver.getCurrentUrl();
		}
		return null;
		
	}



}
