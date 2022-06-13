
package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
@Test
public void homePageTest() {
	System.out.println("HP test");
	int i=9/0;
	
}
@Test(dependsOnMethods="homePageTest")
public void searchTest() {
	System.out.println("search test");
	
}
@Test(dependsOnMethods="homePageTest")
public void addToCartTest() {
	System.out.println("add to cart test");
	
}
}
