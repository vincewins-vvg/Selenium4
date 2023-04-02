package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadByUsingReadExcel extends ProjectSpecificMethodToReadFromExcel {
	//extending PSM to use pre and post steps
	@BeforeTest 
	public void sendFileName()
	{
		excelFileName="TestSampleData"; //this value will be set in ProjectSpecificMethodToReadFromExcel sendData method
		                                // which will called after @BeforeTest
	}

	@Test(dataProvider="sendData") //used for data parameterisation by calling @DataProvider
	public void toCreateLead(String userName , String pwd, String companyName, String fName, String lName)  {
		//WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();

		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






