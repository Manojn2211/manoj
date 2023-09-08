package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_id {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
// to auto generated mathod  
driver.get("https://demo.actitime.com");
driver.findElement(By.xpath("//input[@ name='username']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("manager");
driver.findElement(By.xpath("//a[@ id='loginButton']")).click();
	}

}
