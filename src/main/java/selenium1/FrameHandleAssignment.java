package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"imageTemplateContainer\"]/img")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("frame-one748593425");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2021");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("Honda");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("elantra");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("black");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("20 km");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("1234");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("divya");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Rochester Hills");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Michigan");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Detroit");
		
		WebElement stateList=driver.findElement(By.id("RESULT_RadioButton-12"));
		
		Select select=new Select(stateList);
		select.selectByValue("Radio-1");
		driver.findElement(By.id("RESULT_TextField-13")).sendKeys("48307");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("9898989898");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("divya@gmail.com");
		
		
		driver.findElement(By.id("FSsubmit")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div[4]/div[2]/a/span[1]")).click();
		
		
		


	}

}
