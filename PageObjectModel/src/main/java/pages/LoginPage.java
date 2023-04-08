package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage enterUserName()
	{
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username").toString());
		return this; //this keyword represents the object of the current class
		//using this so that the flow remains in the same page
	}
	
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password").toString());
		return this; //this keyword represents the object of the current class
		//using this so that the flow remains in the same page
	}
	
	public  HomePage clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(); //this will move the flow to HomePage class
	}

}
