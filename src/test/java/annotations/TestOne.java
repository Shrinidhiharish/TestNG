package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne extends TestBase{
		
		@AfterClass
		public void myAfterClass() {
			System.out.println(" i am inside my after class");
		}
		

		@BeforeClass
		public void myBeforeClassMethod() {
			System.out.println(" I am inside my Before class ");
		}
		@BeforeMethod
		public void myBeforeMethod() {
			System.out.println(" I am inside my Before method");
		}

		@Test
		public void TestMethodOne() {
			System.out.println(" I am inside Test method");
		}

		@Test
		public void TestMethodTwo() {
			System.out.println(" I am inside Test method Two");
		}

		@AfterMethod
		public void afterMethod() {
			System.out.println(" I am inside After method");
		}

	}

