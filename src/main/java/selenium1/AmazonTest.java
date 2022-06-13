package selenium1;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		br.init_driver("chrome");

		br.navigateUrl("https://www.amazon.com");
		System.out.println(br.getPageTitle());
		System.out.println(br.getPageUrl());
		br.closeBrowser();

		br.init_driver("edge");

		br.navigateUrl("https://www.amazon.com");
		System.out.println(br.getPageTitle());
		System.out.println(br.getPageUrl());
		br.closeBrowser();
		
		br.init_driver("firefox");

		br.navigateUrl("https://www.amazon.com");
		System.out.println(br.getPageTitle());
		System.out.println(br.getPageUrl());
		br.closeBrowser();

	}

}
