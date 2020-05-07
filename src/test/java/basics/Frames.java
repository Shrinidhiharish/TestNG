package basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Frames {
	@Test
	public void car()
	{
		System.out.println("car method");
	}
	
	@Test(dataProvider = "Auto")
	public void bike(String username, String password)
	{
		System.out.println("Bike method");
	}
	
	@Test
	public void Truck()
	{
		System.out.println("Truck method");
	}
	
	@DataProvider
	public Object[][] Auto()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetname";
		data[0][1]="password";
		
		data[1][0]="firstsetnameshri";
		data[1][1]="passwordshri";
		
		data[2][0]="firstsetnamenidhi";
		data[2][1]="passwordnidhi";
		return data;
		
	}
	
	@Test
	public void bus()
	{
		System.out.println("Bus method");
	}
}

