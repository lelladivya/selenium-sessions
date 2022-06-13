package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationAssignment {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
	 driver=new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		List <WebElement>list=driver.findElements(By.xpath("(//div[@class='swiper-wrapper'])[3]/div//img"));
		for(WebElement e:list) {
			String text=e.getText();
			System.out.println(text);
		}

	}

}
