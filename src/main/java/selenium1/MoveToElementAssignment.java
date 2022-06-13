package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		WebElement categories=driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		WebElement bakery=driver.findElement(By.xpath("//a[text()='Bakery, Cakes & Dairy' and @qa='catL1']"));
		WebElement cookies=driver.findElement(By.xpath("//*[@id=\"bakery-cakes-dairy\"]/div/div/div[1]/ul/li[5]/a"));
		//WebElement premiumCookies=driver.findElement(By.xpath("(//a[text()='Premium Cookies'])[2]"));



		Actions act=new Actions(driver);
		act.moveToElement(categories).moveToElement(bakery).build().perform();
		Thread.sleep(2000);
		//act.moveToElement(cookies).moveToElement(premiumCookies).click().build().perform();
//		

		

	}

}
