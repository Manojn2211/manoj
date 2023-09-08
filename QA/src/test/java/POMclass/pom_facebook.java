package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declaration
public class pom_facebook {
	@FindBy(xpath = "(//input[@type='password'])[2]")private WebElement Firstname;
	@FindBy(xpath = "(//input[@type='text'])[3]")private WebElement Surname;
	@FindBy(xpath = "(//input[@type='text'])[4]")private WebElement Mobilenumberoremailaddress;
	@FindBy(xpath = "(//input[@type='password'])[2]")private WebElement Newpassword;
	//initialization
	public pom_facebook(WebDriver driver) {
	PageFactory.initElements(driver, this);
		
	}
	//implementation
	public WebElement getFirstname() {
		return Firstname;
	}
	public WebElement getSurname() {
		return Surname;
	}
	public WebElement getMobilenumberoremailaddress() {
		return Mobilenumberoremailaddress;
	}
	public WebElement getNewpassword() {
		return Newpassword;
	}
	
	
}
