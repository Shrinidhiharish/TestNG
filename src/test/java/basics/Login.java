package basics;

import org.testng.annotations.Test;

public class Login {

	@Test(groups= {"smoke"})
	public void method1()
	{
		System.out.println("running the code from testNG complier");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Running multiple methods in single method");
	}
	
	
}
