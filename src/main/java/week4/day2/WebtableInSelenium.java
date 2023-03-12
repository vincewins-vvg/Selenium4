package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableInSelenium {

//	<table>
//	<thead>
//	</thead>
//	<tbody>
//	<tr> <td></td> </tr>
//	<tr> <td></td> </tr>
//	<tbody>
//	</table>

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find the table - store as Webelement
		//Find the no of rows <tr> store as List
		//Find the no of data in row <td> store in List
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		WebElement fromStation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStation.clear();
		fromStation.sendKeys("MAS",Keys.TAB);
		
		WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toStation.clear();
		toStation.sendKeys("SBC",Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//Store table as WebElement
		WebElement webTable = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]"));
	    
		//Store table row in lists
		List<WebElement> tableRow = driver.findElements(By.tagName("tr"));
       
		for (int i = 1; i < tableRow.size()-1; i++) {
			//Get table data for each table rows
			List<WebElement> tableData = tableRow.get(i).findElements(By.tagName("td"));
			
			//iterate through each table data
			for (WebElement eachRowTD : tableData) {
				
				System.out.println(eachRowTD.getText()+"    ");
			}
			System.out.println();
		}

	}

}
