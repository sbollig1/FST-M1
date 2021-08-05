package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		System.out.println("The URl of the image is:::  " + driver.findElement(By.xpath("//img")).getAttribute("src"));
		
		driver.close();

	}

}
