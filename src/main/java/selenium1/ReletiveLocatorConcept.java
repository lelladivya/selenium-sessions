package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ReletiveLocatorConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele=driver.findElement(By.linkText("Whitehorse, Canada"));
		String right=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(right);
		String left=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(left);
		String above=driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(above);
		String below=driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(below);
		String near=driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(near);
		
		
		
		

	}

}
