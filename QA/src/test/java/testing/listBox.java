package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox {
	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Alone ");
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("_manu");
driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8121729010");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("717327");
WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
Thread.sleep(3000);
Select obj=new Select(year);
obj.selectByVisibleText("1999");
WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
Thread.sleep(2000);
Select obj2=new Select(month);
obj2.selectByVisibleText("Jul");
WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
Thread.sleep(2000);
Select obj3=new Select(day);
obj3.selectByVisibleText("23");
driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();	}
}
