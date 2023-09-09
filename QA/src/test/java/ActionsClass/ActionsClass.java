package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		manoj
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
WebElement gmail=driver.findElement(By.xpath("//a[@class='gb_y']"));
Actions act=new Actions(driver);
//act.moveToElement(gmail).contextClick().perform();
//act.moveToElement(gmail).click().perform();
act.moveToElement(gmail).doubleClick().perform();
		System.out.println("hello");
	}

}
