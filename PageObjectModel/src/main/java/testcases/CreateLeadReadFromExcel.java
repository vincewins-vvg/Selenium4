package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.HomePage;
import pages.LoginPage;

public class CreateLeadReadFromExcel extends ProjectSpecificMethod {
	
	@BeforeTest 
	public void sendFileName()
	{
		excelFileName="TestSampleData"; //this value will be set in ProjectSpecificMethodToReadFromExcel sendData method
		testName="CreateLeadReadFromExcel";                               // which will called after @BeforeTest
		testDescription="Create Lead by reading excel";
		testCategory="Functional";
		testAuthor="Vijay";
	}

	
	@Test (dataProvider="sendData")
	public void runLogin(String userName , String pwd, String companyName, String fName, String lName) throws InterruptedException {
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
