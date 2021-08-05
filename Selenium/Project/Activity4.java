package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		String secondHeading = driver.findElement(By.xpath("//h2")).getText();
		
		if(secondHeading.matches("Quia quis non")) {
			System.out.println("The second heading in the page is::: "+ secondHeading);
			driver.close();
		}
		
		else {
			System.out.println("The Second heading is not Quia quis non ");
		}


	}

}
