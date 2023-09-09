package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
manojchowdary
public class annotations {
	@BeforeSuite
	public void m1() {
		Reporter.log("==connect of Database==",true);
	}
	@BeforeClass
	public void m2() {
		Reporter.log("==open the Browser==",true);
	}
	@BeforeMethod
	public void m3() {
		Reporter.log("==login the Application==",true);
	}
	@Test
	public void t1() {
	Reporter.log("==boss i am main TestCase==",true);
	}
	@BeforeMethod
	public void m4() {
		Reporter.log("== logout the application==",true);
	}
	@AfterClass
	public void m5() {
		Reporter.log("==close the browser==",true);
	}
	@AfterSuite
	public void m6() {
		Reporter.log("==disconnect the database==",true);
	}
}
