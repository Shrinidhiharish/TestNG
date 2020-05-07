package basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {

	@AfterTest
	public void dismiss()
	{
		System.out.println("Lets Learn about prioitising");
	}
	
	@BeforeTest
	public void accept()
	{
		System.out.println("second method");
	}
	
	@Test
	public void others()
	{
		System.out.println("Third method");
	}
	
	@Test(groups= {"smoke"})
	public void otherssecond()
	{
		System.out.println("Second_Third method");
	}
	
	@Test
	public void othersthird()
	{
		System.out.println("third_Third method");
	}
	
}
