package testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("htttps://www.amazon.com");
		driver.manage().window().minimize();
		

	}

}
