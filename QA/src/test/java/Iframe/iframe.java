package Iframe;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframe {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new EdgeDriver();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
driver.switchTo().frame(0);
String data= driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
System.out.println(data);
Thread.sleep(2000);


driver.switchTo().defaultContent();
driver.switchTo().frame(1);
String data2=driver.findElement(By.xpath("//a[text()='AbstractDriverOptions'][1]")).getText();
System.out.println(data2);
Thread.sleep(2000);


driver.switchTo().defaultContent();	
driver.switchTo().frame(2);
String data3 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi'][1]")).getText();
System.out.println(data3);
		hello
		
	}

}
