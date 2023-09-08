package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {
	@Test
	public void login() {
		Reporter.log("i am login",true);
		assertEquals(false, false);
	}

}
