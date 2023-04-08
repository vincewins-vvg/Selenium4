package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public MyHomePage clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
