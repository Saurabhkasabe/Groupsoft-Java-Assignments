package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
	//	driver.get("https://www.nykaa.com/  ");
	//	driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']"));
		
		
	//	driver.get("https://www.swiggy.com/");
	//	driver.findElement(By.xpath("//span[text()='FIND FOOD']"));
		
		driver.get("https://www.axisbank.com/");
		driver.findElement(By.xpath("//div[contains(@class,'loginClk ')]"));
		
		//driver.get("https://www.amazon.in/ ");
	//driver.findElement(By.xpath("//span[contains(text(),'Up to 70% off')]"));
		
		
		
		
		

	}

}
