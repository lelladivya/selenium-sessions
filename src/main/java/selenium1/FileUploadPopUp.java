package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {
	//to upload file which is present in the desktop application:

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//to pass file path through send keys in inspect under choosefile type="file" must be there:
		driver.findElement(By.name("upfile")).sendKeys("C:/Users/Rajesh/Downloads/TC (1).xls");//changed '\'in the path to'/'
	}

}
