package basics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CheckBoxs {

	@Test(groups= {"smoke"})
	public void method1()
	{
		System.out.println("Lets use xml file");
	}
	
	@BeforeMethod
	public void method2()
	{
		System.out.println("Running multiple classes with one click on xml file");
	}
	
	@Test
	public void method4()
	{
		System.out.println("Lets use xml file 4");
	}
	
	@Test
	public void method5()
	{
		System.out.println("Lets use xml file 5");
	}
	
}
