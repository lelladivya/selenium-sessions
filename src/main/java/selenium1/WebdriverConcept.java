package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverConcept {
	
	public static void main(String[]args) {
	//System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Google")) {
		System.out.println("Correct title");
	}
		else {
			System.out.println("incorrect title");
		}
	driver.quit();
	
	
	
	}
	
	
	}

