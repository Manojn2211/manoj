package testing;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.amazon.com");
		//create the object of Dimension,size of the browser
		Dimension obj=new Dimension(100,200);
		driver.manage().window().setSize(obj);

	}

}
