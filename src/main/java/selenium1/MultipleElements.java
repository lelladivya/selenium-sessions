package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// find out no of links in the page
		//print the text of the each link;
		//ignore those links who has no or empty text;
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.init_driver("chrome");
		brUtil.navigateUrl("https://www.amazon.com/");
		
		By links=By.tagName("a");
		List<WebElement>linksList=driver.findElements(links);
		System.out.println(linksList.size());
		
		for(int i=0;i<linksList.size();i++) {
			if(!linksList.isEmpty()) {
			String text=linksList.get(i).getText();
			if(!linksList.isEmpty()) {
				System.out.println(text);
			}
			
			}
		}
		
//		for(WebElement e:linksList) {
//			System.out.println(e.getText());
//		}
//		
//		//java streams:
//		linksList.stream().forEach(ele ->System.out.println(ele.getText()));
//		
		
	}

}
