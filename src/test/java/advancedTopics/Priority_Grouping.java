package advancedTopics;
import org.testng.annotations.Test;

public class Priority_Grouping {
	@Test(priority=0)
	public void myTestOne() {
		System.out.println("I am in myTestOne");
	}

	@Test(priority=1)
	public void myTestTwo() {
		System.out.println("I am in myTestTwo");
	}

	@Test(priority=2)
	public void myTestThree() {
		System.out.println("I am in myTestThree");
	}

}
