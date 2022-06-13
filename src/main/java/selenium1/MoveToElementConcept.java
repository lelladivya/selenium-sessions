package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://mrbool.com/search/?txt%20search=how%20-to-create-menu-with-submenu-using-css-html");
		
		WebElement content=driver.findElement(By.className("menulink"));
		Actions act=new Actions(driver);
		act.moveToElement(content).perform();
		driver.findElement(By.linkText("COURSES")).click();

	}

}
