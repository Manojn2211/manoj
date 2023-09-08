package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text_value {


	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.xpath("//a[text()='Images']")).click();
	}

}
