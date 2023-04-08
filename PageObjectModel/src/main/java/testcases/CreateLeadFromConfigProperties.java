package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;

public class CreateLeadFromConfigProperties extends ProjectSpecificMethod {
	//extending PSM to use pre and post steps

	@Test
	public void toCreateLead() throws IOException  {
		//WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
		
        Properties prop = new Properties();
        prop.load(fis);

	driver.findElement(By.id("username")).sendKeys(prop.getProperty("username").toString());
	driver.findElement(By.id("password")).sendKeys(prop.getProperty("password").toString());
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
}
}






