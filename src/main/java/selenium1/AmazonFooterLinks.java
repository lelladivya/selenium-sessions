package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterLinks {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		By footerLinksList=By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//ul/li");
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.printAllElementsList(footerLinksList);
		System.out.println(eleUtil.getElementsListCount(footerLinksList));
		System.out.println(eleUtil.getElementsTextList(footerLinksList));
		eleUtil.clickOnElementFromSection(footerLinksList, "About Amazon");
		
	}

}
