package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alter {

	public static void main(String[] args) {
//WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().alert().accept();
		
	}

}
