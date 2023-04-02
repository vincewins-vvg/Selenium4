package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
//	driver.findElement(By.linkText("Leads")).click();
//	driver.findElement(By.linkText("Create Lead")).click();
//	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
//	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
//	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
//	driver.findElement(By.name("submitButton")).click();
	
	public MyHomePage createLead()
	{
		driver.findElement(By.linkText("Leads")).click();
		return this;
	}
	public MyHomePage clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return this;
	}
	
	public MyHomePage enterCompanyName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	public MyHomePage enterFirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("VJ");
		return this;
	}
	
	public MyHomePage enterLastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vince");
		return this;
	}

	public ViewLeadPage enterCreateLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

	
	
}
