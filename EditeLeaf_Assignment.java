package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditeLeaf_Assignment {

	public static void main(String[] args) throws InterruptedException {
	
       ChromeDriver driver = new ChromeDriver();

		    
		            driver.get("http://leaftaps.com/opentaps/");
		            driver.manage().window().maximize();
                    Thread.sleep(2000);
		           
		            driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		            Thread.sleep(2000);
		            driver.findElement(By.id("password")).sendKeys("crmsfa");
		            Thread.sleep(2000);
		          
		            driver.findElement(By.className("decorativeSubmit")).click();

		            driver.findElement(By.linkText("CRM/SFA")).click();

		            driver.findElement(By.linkText("Leads")).click();

		        
		            driver.findElement(By.linkText("Create Lead")).click();

		        
		            driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Groupsoft");
		            driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saurabh");
		            driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kasabe");
		            driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Saurabh");

		            driver.findElement(By.name("departmentName")).sendKeys("QA");

		          
		            driver.findElement(By.id("createLeadForm_description")).sendKeys("As a Qa Tester and have more than 4 years of experience and from last july I am working with Grousoftus ltd. ");

		           driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("kasabesaurabh5@gmail.com");

		           WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		            Select s = new Select(stateDropdown);
		             s.selectByVisibleText("New York");

		            driver.findElement(By.name("submitButton")).click();

		       
		            driver.findElement(By.linkText("Edit")).click();

		     
		            driver.findElement(By.id("updateLeadForm_description")).clear();
		          driver.findElement(By.cssSelector("textarea[name='importantNote']")).sendKeys("This is Importaint Note");

		            driver.findElement(By.name("submitButton")).click();

		            String pageTitle = driver.getTitle();
		           System.out.println(pageTitle);

		     
		           driver.quit();
		        }
		    
		

	}


