package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath_by_index {
	public static void main(String[] args) {
WebDriver driver=new  ChromeDriver();
driver.get("https://demo.actitime.com");
driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
driver.findElement(By.xpath("(//div)[13]")).click();
	}
}
  