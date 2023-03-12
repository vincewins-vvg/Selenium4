package week5.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethodToReadFromExcel {
	//should be extended by each @test
	
	public  RemoteWebDriver	driver;
	public String excelFileName; 
	
	@Parameters({"url","browser"}) //this will be referenced and values passed from testng2 xml
	@BeforeMethod //runs for each @test
	public void openBrowser(String url, String browser) {
		
	switch (browser) {
	case "chrome":
		driver = new ChromeDriver();		
		break;
	case "edge":
		driver = new EdgeDriver();		
		break;

	default:
		break;
	}
		driver.manage().window().maximize();
		driver.get(url);
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

}
