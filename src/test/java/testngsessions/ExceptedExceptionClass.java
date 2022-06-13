package testngsessions;

import org.testng.annotations.Test;

public class ExceptedExceptionClass {
	String name="Naveen";
	@Test(expectedExceptions= { NullPointerException.class,ArithmeticException.class})
	public void searchProductTest() {
		System.out.println("macbook");
		int i=9/0;
		ExceptedExceptionClass object=new ExceptedExceptionClass();
		object=null;
		System.out.println(object.name);
	}

}
