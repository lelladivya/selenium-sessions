package selenium1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util {

	public WebDriver driver;

	public WebDriver init_driver(String BrowserName) {
		System.out.println("browser name is:" + BrowserName);
//		if (BrowserName.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();	
//		}
//		else if (BrowserName.equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else if (BrowserName.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		}
//		else {
//			System.out.println("please enter correct browser name: "+ BrowserName);
//		}
//		
//		return driver;

		switch (BrowserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			break;

		default:
			System.out.println("please enter correct browser name: "+ BrowserName);
			break;
		}
		return driver;
	}

	@Override
	public void navigateUrl(String url) {
		if (url == null) {
			return;
		}
		if (url.isEmpty()) {
			return;
		}
		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {
			System.out.println("please pass the right url http(s) missing");
			return;
		}
		driver.get(url);

	}

	@Override
	public void navigateUrl(URL url) {
		driver.navigate().to(url);

	}

	@Override
	public String getPageTitle() {

		return driver.getTitle();
	}

	@Override
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}

	@Override
	public void closeBrowser() {
		driver.close();

	}

	@Override
	public void quitBrowser() {
		driver.quit();

	}

}
