package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//draggable element
		WebElement draggableElement = driver.findElement(By.id("form:conpnl_header"));
		
		
		//Get current window home page handle id
		String homePage = driver.getWindowHandle();
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_window']")).click();
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//To store all opened tabs/windows into a set
		//Reason: Set doesnt hold duplicate values
		//.getWindowHanldes returns Set
		Set<String> windowHandles = driver.getWindowHandles();
		
		//Moving set contents to List to fetch it since Set doesnt have .get() method
		List<String> listOfHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listOfHandles.get(1));
		System.out.println("New tab URL is: "+driver.getCurrentUrl());
		System.out.println("New tab is: "+driver.getTitle());
		
		//switching back to homepage
		driver.switchTo().window(homePage);
		System.out.println("Home page title: "+driver.getTitle());
		
		driver.close(); //closes the currently focused window,
		driver.quit(); //closes every associated window
		
		
		
		
		

	}

}
