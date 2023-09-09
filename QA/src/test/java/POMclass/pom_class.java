package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class {

//declaration
@FindBy(xpath = "//input[@id='username']")private WebElement untextbox;
@FindBy(xpath = "(//input[@type='password'])[1]")private WebElement pwdtextbox;
@FindBy(xpath = "//div[text()='Login ']")private WebElement loginbtn;
//initialization
public pom_class(WebDriver driver ) {
PageFactory.initElements(driver, this);
	sathi++
	
	}
//implementation
public WebElement getUntextbox() {
	return untextbox;
}
public WebElement getPwdtextbox() {
	return pwdtextbox;
}
public WebElement getLoginbtn() {
	return loginbtn;
}

}
