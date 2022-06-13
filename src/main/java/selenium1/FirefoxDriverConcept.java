package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver\\geckodriver.exe");

		//WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		// driver=new EdgeDriver();
		// driver=new EdgeDriver();

		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("incorrect title");
		}
		driver.quit();

	}

}
