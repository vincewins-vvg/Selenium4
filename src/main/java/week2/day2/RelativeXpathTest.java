package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RelativeXpathTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Url:http://leaftaps.com/opentaps/control/main
		//UserName:Demosalesmanager
		//Password:crmsfa
		
		ChromeDriver cdr = new ChromeDriver();
		cdr.get("http://leaftaps.com/opentaps/control/main/");
		cdr.manage().window().maximize();
		
		cdr.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		cdr.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		cdr.findElement(By.className("decorativeSubmit")).click();
		String homePageTitle = cdr.getTitle();
		System.out.println("Home page title is "+homePageTitle);
		//Relative text, attribute, partial text based x paths
		cdr.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		cdr.findElement(By.xpath("//a[text()='Create Lead']")).click();
		cdr.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Vins1");
		cdr.findElement(By.id("createLeadForm_firstName")).sendKeys("VJ");
		cdr.findElement(By.id("createLeadForm_lastName")).sendKeys("Vijay");
		cdr.findElement(By.id("createLeadForm_lastName")).sendKeys("Vijay");
		cdr.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		cdr.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		cdr.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Testing");
		//createLeadForm_primaryEmail
		
		//*********  Dropdown field ******
		WebElement stateProvince = cdr.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select provinceDropdown = new Select(stateProvince);
		provinceDropdown.selectByVisibleText("New York");
		cdr.findElement(By.className("smallSubmit")).click();
		
		
		

	}

}
