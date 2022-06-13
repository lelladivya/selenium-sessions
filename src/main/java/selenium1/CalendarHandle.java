package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
//		String currentYearMonth=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		System.out.println(currentYearMonth);
//		
//		while(!currentYearMonth.equalsIgnoreCase("October 2022")) {
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			 currentYearMonth=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//
//			}
//			
//		driver.findElement(By.xpath("//a[text()='18']")).click();
//					
		//selectFutureDate("November 2023","22");
		selectPreviousDate("January 2022","25");
					
					
				
			}
	
	public static void selectDate(String dateNum) {
		driver.findElement(By.xpath("//a[text()='"+dateNum+"']")).click(); 
		}
	
	public static void selectFutureDate(String monthYear,String dateNum) {
		
		if(monthYear.contains("February")&&Integer.parseInt(dateNum)>29) {
			System.out.println("Wrong date passed..");
			return;
		}
		if(Integer.parseInt(dateNum)>31) {
			System.out.println("Wrong date passed..");
			return;
			
		}
		String currentYearMonth=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		while(!currentYearMonth.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			 currentYearMonth=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

			}
		selectDate(dateNum);
			
		
					
	}
	
	public static void selectPreviousDate(String monthYear,String dateNum) {
		
		if(monthYear.contains("February")&&Integer.parseInt(dateNum)>29) {
			System.out.println("Wrong date passed..");
			return;
		}
		if(Integer.parseInt(dateNum)>31) {
			System.out.println("Wrong date passed..");
			return;
			
		}
		String currentYearMonth=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		while(!currentYearMonth.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			 currentYearMonth=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

			}
		selectDate(dateNum);
			
		
	}
}
		
		
	


