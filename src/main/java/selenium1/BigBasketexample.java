package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketexample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.meganav-shop")).click();
		Actions act=new Actions(driver);
		Thread.sleep(3000);

		WebElement cakes=driver.findElement(By.linkText("Bakery, Cakes & Dairy"));
		act.moveToElement(cakes).perform();
		Thread.sleep(3000);

		WebElement rusks=driver.findElement(By.linkText("Cookies, Rusk & Khari"));
		act.moveToElement(rusks).perform();
		Thread.sleep(3000);
		WebElement premiumCookies=driver.findElement(By.linkText("Premium Cookies"));
		act.moveToElement(premiumCookies).perform();
		
		Thread.sleep(3000);
		WebElement biscuits=driver.findElement(By.linkText("Biscuits"));
		act.moveToElement(biscuits).click().perform();

	}

}
