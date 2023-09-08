package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class altergoogle {

	public static void main(String[] args) {
WebDriver driver=new  EdgeDriver();
driver.get("https://www.google.com");
driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("babymovie");
driver.findElement(By.xpath("(//div[@class='pcTkSc'])[1]"));

}

}
