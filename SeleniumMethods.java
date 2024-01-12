package week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");//Landing on page
	Thread.sleep(1000);//wait
	    driver.manage().window().maximize();//maximize page
		Thread.sleep(1000);
	    driver.findElement(By.id("username")).sendKeys("DemoCSR");//Used locator
		Thread.sleep(1000);
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
