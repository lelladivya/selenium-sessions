package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	//runs test n no of times
@Test(invocationCount=10)
public void createUserTest() {
	System.out.println("create user test"); 
}

}
