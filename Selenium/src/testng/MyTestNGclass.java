package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyTestNGclass {
@Test(priority = 1,dataProvider = "mydata")
public void testcase2(String s1, String s2) {
	System.out.println("This is from 1st testcase");
}
@Test(priority = 2)
public void testcase1() {
	System.out.println("This is from 2nd test case");
}
@BeforeTest
public void beforetest() {
	System.out.println("This is from before test");
}
@AfterTest
public void aftertest() {
	System.out.println("This is from after test");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("This is from before method");
}
@AfterMethod
public void aftermethod() {
	System.out.println("This is from after method");
}
@BeforeClass
public void beforeclass() {
	System.out.println("This is from before class");
}
@AfterClass
public void afterclass() {
	System.out.println("This is from after class");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("This is from beforesuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("This is from after suite");
}
@DataProvider
public Object[][] mydata(){
	Object[][] o = new Object[4][2];
	o[0][0] = "Chrome";
	o[0][1] = "Firefox";
	o[1][0] = "edge";
	o[1][1] = "safari";
	return o;
	
}
}
