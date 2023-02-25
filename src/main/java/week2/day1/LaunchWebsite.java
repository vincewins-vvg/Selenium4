package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver cdr = new ChromeDriver();
		cdr.get("https://login.salesforce.com/");
		cdr.manage().window().maximize();
		
		cdr.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		cdr.findElement(By.id("password")).sendKeys("Leaf@123");
		cdr.findElement(By.id("Login")).click();
		String homePageTitle = cdr.getTitle();
		System.out.println("Home page title is "+homePageTitle);
		

	}

}
