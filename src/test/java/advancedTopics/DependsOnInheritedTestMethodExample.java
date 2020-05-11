package advancedTopics;

import org.testng.annotations.Test;

public class DependsOnInheritedTestMethodExample extends ParentClassExample {

	@Test(dependsOnMethods = "myTestE")
	public void myTestA() {
		System.out.println("I am in myTestA");
	}
	
	@Test
	public void myTestB() {
		System.out.println("I am in myTestB");
	}
	
}
