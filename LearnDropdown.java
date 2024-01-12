package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/select.xhtml");
	driver.manage().window().maximize();
	Thread.sleep(2000);
     WebElement dropdown=	driver.findElement(By.className("ui-selectonemenu"));
           Select S = new Select (dropdown);
           S.selectByIndex(2);
           Thread.sleep(2000);
           S.selectByVisibleText("Cypress");

	
	
	}

}
