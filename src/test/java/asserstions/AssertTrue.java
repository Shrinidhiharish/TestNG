package asserstions;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AssertTrue {
		@Test
		public void myTest() {
			
			assertTrue(checkBigger(10, 1));	
			
		}
		
		public boolean checkBigger(int x, int y) {
			
			boolean result;
			if(x>y) {
				result = true;
			}else {
				result = false;
			}
			return result;
		}
		
		@Test
		public void myTestWithMessage() {
			
			assertTrue(checkBigger(5, 10), "First number is smaller than second number");
			
		}
		
}
