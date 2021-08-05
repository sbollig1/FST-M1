package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		System.out.println("The Current URL is: "+ driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
		
		String title = driver.getTitle();
		
		if(title.matches("Jobs – Alchemy Jobs")) {
			System.out.println(" The URL after clicking on jobs is :: "+ driver.getCurrentUrl());
			System.out.println("The Title of Curent page is: "+ title);
			driver.close();
		}
		
		else {
			System.out.println("The Jobs page is not the one as expected");
		}

	}

}
