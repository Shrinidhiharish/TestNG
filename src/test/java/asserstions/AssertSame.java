package asserstions;

import static org.testng.Assert.assertSame;

import org.testng.annotations.Test;

public class AssertSame {
	String str1 = "abcd";
	String str2 = "abc";
	
	@Test
	public void myAssertSameTest() {
		
		assertSame(str1, str2);
		
	}
	
	@Test
	public void myAssertSameWithMessageTest() {
		
		assertSame(str1, str2, "References to Str1 is not same with references to Str2");
		
	}
	
}
