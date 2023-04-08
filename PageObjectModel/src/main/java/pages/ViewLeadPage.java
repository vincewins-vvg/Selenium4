package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethod;


public class ViewLeadPage extends ProjectSpecificMethod{
	
	public ViewLeadPage verifyFirstName() {
		String actName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		Assert.assertEquals(actName, "VJ");
		return this;
	}

}
