package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title of the page is: " + driver.getTitle());
		
		System.out.println("Inputbox is displayed? " +driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		System.out.println("Inputbox is displayed? " +driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
		
		
		driver.close();
 

	}

}
