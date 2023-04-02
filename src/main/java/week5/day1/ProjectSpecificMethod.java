package week5.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
	//should be extended by each @test
	
	public  ChromeDriver	driver;

	
	@BeforeMethod //runs for each @test
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	@AfterMethod // runs after every @test
	public void closeBrowser() {
		
		driver.close();
	}

}
