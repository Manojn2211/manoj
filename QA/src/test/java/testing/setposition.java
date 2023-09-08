package testing;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class setposition {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com");
//create the object of setposition,position of application,position of the browser
Point obj=new Point(500, 500);
driver.manage().window().setPosition(obj);
	}
}
