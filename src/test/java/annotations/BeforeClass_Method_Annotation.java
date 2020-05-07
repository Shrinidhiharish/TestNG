package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BeforeClass_Method_Annotation {
	
@BeforeClass
  public void myBeforeClassMethod() {
		System.out.println(" I am inside my Before class ");
	}
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
}
