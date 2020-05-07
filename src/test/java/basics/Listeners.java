package basics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners implements ITestListener{

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result) {
	System.out.println("Success");
	
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("Success");
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
