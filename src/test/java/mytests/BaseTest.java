package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;

	@BeforeTest
	@Parameters({ "browser", "url", "headless"})
	public void setUp(String browserName, String appUrl,String headlesss) {

		
		System.out.println("browser name :" + browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
			ChromeOptions co=new ChromeOptions();
			if(Boolean.parseBoolean(headlesss)) {
				
				co.setHeadless(true);
			}
			driver=new ChromeDriver(co);
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("provide correct browser name");
		}
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
