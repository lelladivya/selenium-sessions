package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDriverConcept {

	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver","c:\\edgedriver\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		//driver=new EdgeDriver();
		//driver=new EdgeDriver();
		
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
