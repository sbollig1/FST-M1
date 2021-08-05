package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		//System.out.println("The Title of cuurent page is " +driver.getTitle());
		
		String heading = driver.findElement(By.className("entry-title")).getText();
		
		if(heading.matches("Welcome to Alchemy Jobs")) {
			System.out.println("The Heading of the current page is:: "+heading);
			driver.close();
		}
		
		else {
			System.out.println("The Heading of the current page is not as expected " +heading);
		}


	}

}