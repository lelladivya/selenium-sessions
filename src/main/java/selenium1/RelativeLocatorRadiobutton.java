package selenium1;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorRadiobutton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		WebElement ele=driver.findElement(By.linkText("Privacy Policy"));
		driver.findElement(with(By.tagName("input")).toRightOf(ele)).click();
		
		WebElement ele2=driver.findElement(By.xpath("//label[text()='Subscribe']"));
		driver.findElement(with(By.tagName("input")).toRightOf(ele2)).click();



	}

}
