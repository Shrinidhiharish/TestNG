package advancedTopics;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependsOnMultipleTestMethodExample {

	@Test(dependsOnMethods = {"myTestB", "myTestC"})
	public void myTestA() {
		System.out.println("I am in myTestA");
		//1st failure
		//assertTrue(false);
	}

	@Test
	public void myTestB() {
		System.out.println("I am in myTestB");
		//2nd failure
		assertTrue(false);
	}

	@Test(dependsOnMethods = "myTestD")
	public void myTestC() {
		System.out.println("I am in myTestC");
	}
	
	@Test
	public void myTestD() {
		System.out.println("I am in myTestD");
	}
}
