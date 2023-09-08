package testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo4 {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com");
//String tit=driver.getTitle();
System.out.println(driver.getTitle());
	}

}
