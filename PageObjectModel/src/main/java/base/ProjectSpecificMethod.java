package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethod {
	//should be extended by each @test
	
	public static ChromeDriver	driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName,testDescription,testAuthor,testCategory;
	
	public static Properties prop;
	public String excelFileName; 

	@BeforeSuite
	public void startReport()
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		// Step3: attach the data with physical file
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testReport()
	{
		test = extent.createTest("VerifyLogin", "Login with valid credential");
		test.assignCategory("smoke");
		test.assignAuthor("Hari");		
		
	}
	
	@BeforeMethod //runs for each @test
	public void openBrowser() throws IOException {
		
		FileInputStream fis = new FileInputStream("src/main/resources/config.properties");        
        prop = new Properties();
		prop.load(fis);
		
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	@DataProvider
	public String[][] sendData() throws IOException
	{
		String data[][]= ReadExcel.testData(excelFileName); //this will send file name to ReadExcel
		
		return data;
	}
	
	@AfterMethod // runs after every @test
	public void closeBrowser() {
		
		driver.close();
	}
	
	@AfterSuite // runs after every Suite completion
	public void stopReport() {
		
		extent.flush();
	}

}
