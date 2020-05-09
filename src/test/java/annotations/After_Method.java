package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class After_Method {
	@BeforeMethod
	public void myBeforeMethod() {
		System.out.println(" I am inside my Before method");
	}

	@Test
	public void TestMethod() {
		System.out.println(" I am inside Test method");
	}

	@Test
	public void TestMethodTwo() {
		System.out.println(" I am inside Test method Two");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" i am inside After method");
	}

}

