package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInSelenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//draggable element
		WebElement draggableElement = driver.findElement(By.id("form:drag_content"));
		WebElement droppableElement = driver.findElement(By.id("form:drop_header"));
		
		
		//Used to perform any actions
		Actions builder = new Actions(driver);
		//To drag and drop based on elements location
		builder.dragAndDrop(draggableElement, droppableElement).perform();
		
		
		
		
		

	}

}
