package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListExampleInSelenium {

	//Use of List in Selenium
//		  - Load amazon.in
//		  - Type mobiles in the search box and do keys.Enter
//		  - Find a common value to locate all the prices
//		  - Print all the mobile prices by replacing all the comma(String.replaceAll(","),"");
//		  - Convert String to Integer using Integer.parseInt(replacedString);
//		  - Add it to list
//		  - Sort the list to find the minimum value(Collections.sort())
//		  - Print the least mobile price
	public static void main(String[] args) {
		
	ChromeDriver cd = new ChromeDriver();
	cd.get("http://www.amazon.in");
	
	cd.manage().window().maximize();
	cd.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	cd.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> priceList = cd.findElements(By.className("a-price-whole"));
	//List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println(priceList.get(0));
}
}
