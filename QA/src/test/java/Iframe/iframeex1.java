package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframeex1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.amazon.in");
Thread.sleep(3000);
WebElement data = driver.findElement(By.xpath("twotabsearchtextbox"));
driver.navigate().refresh();
data.sendKeys("mobiles under 20000");
	}

}
