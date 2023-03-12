package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadByUsingDataProvider extends ProjectSpecificMethod {
	//extending PSM to use pre and post steps

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
	@DataProvider
	public String[][] sendData()
	{
		String data[][]= new String[2][5];
		data[0][0]="Demosalesmanager";
		data[0][1]="crmsfa";
		data[0][2]="TestLeaf";
		data[0][3]="Vince";
		data[0][4]="V";
		
		data[1][0]="Demosalesmanager";
		data[1][1]="crmsfa";
		data[1][2]="TestLeaf";
		data[1][3]="Vijay";
		data[1][4]="V";
		
		return data;
		
	}
}






