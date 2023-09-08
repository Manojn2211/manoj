package testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwww.amazon.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();

	}

}
