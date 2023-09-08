package testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo5 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amozon.com");
String url=driver.getCurrentUrl();
System.out.println(url);
	}

}
