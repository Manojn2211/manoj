package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
WebElement ele1=driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement ele2=driver.findElement(By.xpath("//div[@id='droppable']"));
Actions act=new Actions(driver);
act.dragAndDrop(ele1, ele2).perform();
Thread.sleep(5000);
driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
WebElement src=driver.findElement(By.xpath("//div[@id='droppable']"));
WebElement dest=driver.findElement(By.xpath("//div[@id='draggable']"));
Actions rta=new Actions(driver);
rta.dragAndDrop(src, dest).perform();
	}

}
