package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.meganav-shop")).click();
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		 List <WebElement> level1=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']/li/a"));
		 for (WebElement e:level1) {
			 act.moveToElement(e).perform();
			 
			System.out.println( e.getText());
			 List <WebElement> level2=driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[2]/li/a"));
			 for(WebElement e2:level2) {
				 act.moveToElement(e2).perform();
				 System.out.println(e2.getText());
				 List <WebElement> level3=driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]/li/a"));
				 for(WebElement e3:level3) {
					 act.moveToElement(e3).perform();
					 System.out.println(e3.getText());
				 
			 }

		 }

	}
	}
}
