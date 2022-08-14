package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	public static void main(String[] args) {
		
	
	/*
	  1. Launch URL "http://leaftaps.com/opentaps/control/login"
	  2. Enter UserName and Password Using Id Locator
	  3. Click on Login Button using Class Locator
	  4. Click on CRM/SFA Link
	  5. Click on Leads Button
	  6. Click on Create Lead 
	  7. Enter CompanyName Field Using id Locator
	  8. Enter FirstName Field Using id Locator
	  9. Enter LastName Field Using id Locator
	  10. Enter FirstName(Local) Field Using id Locator
	  11. Enter Department Field Using any Locator of Your Choice
	  12. Enter Description Field Using any Locator of your choice 
	  13. Enter your email in the E-mail address Field using the locator of your choice
	  14. Select State/Province as NewYork Using Visible Text
	  15. Click on Create Button
              16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
              17. Click on Duplicate button
              18. Clear the CompanyName Field using .clear() And Enter new CompanyName
              19.Clear the FirstName Field using .clear() And Enter new FirstName
              20.Click on Create Lead Button
              21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		 WebElement uname = driver.findElement(By.id("username"));
		 uname.sendKeys("Demosalesmanager");
		 WebElement pwd = driver.findElement(By.id("password"));
		 pwd.sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 
		 WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		 companyName.sendKeys("DXC");
		
		 WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		 firstName.sendKeys("Pooja");
		 
		 WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		 lastName.sendKeys("Shetty");
		 
		 
		 WebElement fnamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 fnamelocal.sendKeys("Shetty");
		 
	
		 WebElement deptname = driver.findElement(By.id("createLeadForm_departmentName"));
		 deptname.sendKeys("IT");
		
		 
		 WebElement desc = driver.findElement(By.xpath("//textarea[contains(@class,'inputBox')][1]"));
		 desc.sendKeys("Testing");
		
		 WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		 email.sendKeys("pooja@gmail.com");
		 
		 WebElement testdropdwn = driver.findElement(By.xpath("//select[contains(@name,'generalStateProvinceGeoId')]"));
		 
		 Select dropdown=new Select(testdropdwn);
		 
		 dropdown.selectByVisibleText("New York");
		 
		 driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
		 
		 
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 
		 WebElement companyNamenew = driver.findElement(By.id("createLeadForm_companyName"));
		 companyNamenew.clear();
		 companyNamenew.sendKeys("TCS");
		 
		 WebElement firstNamenew = driver.findElement(By.id("createLeadForm_firstName"));
		 firstNamenew.clear();
		 firstNamenew.sendKeys("Priya");
		 
		 driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
		 
		 
		 String title2 = driver.getTitle();
		 
		 System.out.println(title2);
		 
		 
		
	}

}
