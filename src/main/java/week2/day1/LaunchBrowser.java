package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://login.salesforce.com");

//		EdgeDriver edriver = new EdgeDriver();
//		edriver.get("https://www.facebook.com");
	}

}
