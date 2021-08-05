package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		String title = driver.getTitle();
		
		if(title.matches("Alchemy Jobs – Job Board Application")) {
			System.out.println("The Title of the current page is "+title);
			driver.close();
		}
		
		else {
			System.out.println("The title was not as expected" +title);
		}

	}

}
