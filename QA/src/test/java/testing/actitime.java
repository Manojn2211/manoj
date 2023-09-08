package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class actitime {

	public static void main(String[] args) {
WebDriver driver=new EdgeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
