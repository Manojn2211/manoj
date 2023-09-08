package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropex1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
WebElement src=driver.findElement(By.xpath("//a[@class='gb_y']"));
Actions act=new Actions(driver);
act.moveToElement(src).click().perform();
driver.findElement(By.xpath("(//a[@data-label='header'])[2]")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manojn9959@gmail.com");
driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
	}

}
