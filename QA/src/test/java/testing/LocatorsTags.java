package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsTags {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles redmi ");
driver.findElement(By.id("nav-search-submit-button")).click();
	}
}