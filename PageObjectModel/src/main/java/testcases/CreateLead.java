package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.HomePage;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethod {
	
//	@BeforeTest
//	public void setup() {
//		excelFileName = "CreateLead";
//	}

	
	@Test //(dataProvider = "fetch")
	public void runLogin() throws InterruptedException {
		System.out.println();
		LoginPage lp = new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.createLead()
		.clickCreateLead()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.enterCreateLeadButton()
		.verifyFirstName();
		
	}

}
