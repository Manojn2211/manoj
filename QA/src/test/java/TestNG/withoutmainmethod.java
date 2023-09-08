package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class withoutmainmethod {
@Test
public void manu() {
Reporter.log("without mainmethod we can run the programe ");
}
@Test
public void manu2() {
	Reporter.log("second method",true);
}
@Test(invocationCount = 5)
public void manu3() {
	Reporter.log("Hi",true);
}
@Test(priority = 1)
public void m2() {
	Reporter.log("jai balayya",true);
}
}


