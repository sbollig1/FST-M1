package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The Title of the current page is: "+ driver.getTitle());
		
		System.out.println("Inputbox is displayed? " +driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
		
		driver.findElement(By.id("toggleCheckbox")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		
		System.out.println("Inputbox is displayed? " +driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
		driver.findElement(By.id("toggleCheckbox")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		
		System.out.println("Inputbox is displayed? " +driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
		
		boolean check;
		check = driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
		
		if(check) {
			
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		}
		
		else {
			System.out.println("The Check box is not yet displayed");
		}
		
		
		driver.close();

	}

}
