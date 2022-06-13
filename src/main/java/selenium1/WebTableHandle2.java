package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle2 {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2022-1298423/punjab-kings-vs-chennai-super-kings-38th-match-1304084/full-scorecard");
		driver.manage().window().maximize();
//		String bowler=driver.findElement(By.xpath("//a[@title='Mayank Agarwal']/../../following-sibling::td//span")).getText();
//		System.out.println(bowler);
//		List<WebElement>details=driver.findElements(By.xpath("//span[text()='c Dube b Theekshana']/../../following-sibling::td"));
//		List<String>detailsList=new ArrayList();
//		for(WebElement e:details) {
//			String text=e.getText();
//			detailsList.add(text);
//		}
//		System.out.println();
		System.out.println(getScoreInfo("Mayank Agarwal"));
		//System.out.println(getScoreInfo("Shikhar Dhawan"));//method dont work as he is notout;

		System.out.println(getScoreInfo("Bhanuka Rajapaksa"));

		System.out.println(getScoreInfo("Liam Livingstone"));

		System.out.println(getScoreInfo("Jonny Bairstow"));
		

	}
	public static String getBowlerName(String name) {
		String bowler=driver.findElement(By.xpath("//a[@title='"+name+"']/../../following-sibling::td//span")).getText();
		return bowler;

	}
	public static List<String> getScoreInfo(String name) {
		String bowler=getBowlerName(name);
		System.out.println("Bowler name:"+bowler);
		List<WebElement>details=driver.findElements(By.xpath("//span[text()='"+bowler+"']/../../following-sibling::td"));
		List<String>detailsList=new ArrayList();
		for(WebElement e:details) {
			String text=e.getText();
			detailsList.add(text);
		}
		return detailsList;

		
	}

}
