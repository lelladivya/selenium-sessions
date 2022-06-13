package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle2 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']")).click();
		
	}
	public static void selectDate(String daymonthDateYear ) {
		driver.findElement(By.xpath("//div[@aria-label='Thu May 19 2022']")).click();
	}

}
