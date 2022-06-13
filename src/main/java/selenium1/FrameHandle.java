package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
//		driver.switchTo().frame(2);
//		String text=driver.findElement(By.xpath("/html/body")).getText();
//		System.out.println(text);
		// frame with webelement:
//		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frameset/frame[1]")));
//		 String text=driver.findElement(By.xpath("/html/body")).getText();
//		System.out.println(text);
		driver.switchTo().frame("main");
		 String text=driver.findElement(By.xpath("/html/body")).getText();
		System.out.println(text);


	}

}
