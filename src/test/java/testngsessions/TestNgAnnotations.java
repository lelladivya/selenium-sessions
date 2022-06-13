package testngsessions;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
//we have following annotations in testng:
	@BeforeSuite
	public void connectWithDb() {
		System.out.println("Bs..connect with db");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("Bt....create user");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Bc..launch briwser");
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("Bm..login to app");
	}
	@Test
	public void homePageTitleTest() {
		System.out.println("home page title test");
	}
	@Test
	public void homepageUrlTest() {
		System.out.println("home page url test");
	}
	
	@Test
	public void isUserLoggedInTest() {
	System.out.println("user logged in test");
}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("Am..login to app");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("At....create user");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC..close briwser");
	}
	@AfterSuite
	public void disconnectWithDb() {
		System.out.println("AS..disconnect with db");
	}
	
}
