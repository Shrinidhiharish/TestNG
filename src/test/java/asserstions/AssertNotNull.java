package asserstions;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class AssertNotNull {
	String str1 = null;
	String str2 = "abc";
	
	@Test
	public void myAssertNotNullTest() {
		
		assertNotNull(str2);
		
	}
	
	@Test
	public void myAssertNotNullWithMessageTest() {
		
		assertNotNull(str2, "The string is null");
		
	}
	
	@Test
	public void myAssertNotNullTestFail() {
		
		assertNotNull(str1);
		
	}
	
	@Test
	public void myAssertNotNullWithMessageTestFail() {
		
		assertNotNull(str1, "The string is null");
		
	}
}
