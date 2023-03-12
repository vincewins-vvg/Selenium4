package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInSelenium3 {
	
	//MULTI SELECT

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//switch to frame where options are present
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		//options to multi select
		WebElement option1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement option2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement option3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		
		
		//Used to perform any actions
		Actions builder = new Actions(driver);
		
		//To select multiple options
		builder.keyDown(Keys.CONTROL)
		.click(option1)
		.click(option2)
		.click(option3).keyUp(Keys.CONTROL).perform();
		
		
		
		
		

	}

}
