package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
//import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.When;

public class StepDefinitionsForGherkin {
	public ChromeDriver driver;
	
	@Given("Open the browser and launch the leaftap application")
	public void launchApp()
	{
		
		driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
@Given("enter the username and password")
public void enterLoginCred()
{
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
@Given("click submit to login")
public void clickSubmitButton()
{
	driver.findElement(By.className("decorativeSubmit")).click();
	}

@Given("click the CRM-SFA link")
public void clickCRMSFALink()
{
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
@Given("chose the create lead option")
public void choseCreateLeadOptions()
{
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	}

@Given("Open the browser and launch the leaftap application url {string}")
public void launchAppWithURL(String url)
{
	
	driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}

@Given("enter the username {string}")
public void enterLoginUser(String username)
{
	
	driver.findElement(By.id("username")).sendKeys(username);
	}

@Given("enter the password {string}")
public void enterLoginPwd(String pwd)
{
	
	driver.findElement(By.id("password")).sendKeys(pwd);
	}

@Given("enter company name {string}")
public void enterCompanyName(String companyName)
{
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}

@Given("enter first name {string}")
public void enterFirstName(String firstName)
{
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

@Given("enter last name {string}")
public void enterLastName(String lastName)
{
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

@When("enter create lead submit button")
public void clickCreateLeadSubmitButton()
{
	driver.findElement(By.name("submitButton")).click();
	}

//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
//driver.findElement(By.name("submitButton")).click();
}
