package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath_by_contains { 
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("8121729010");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("717327");
driver.findElement(By.xpath("//button[contains(@value,'1')]")).click(); 
/*   driver.get("https://www.google.com");
driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();	*/
}
	

}
