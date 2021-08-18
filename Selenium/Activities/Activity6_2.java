package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("The Title of the current page is: "+ driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
		System.out.println(driver.findElement(By.id("ajax-content")).getText());
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		System.out.println(driver.findElement(By.id("ajax-content")).getText());
		
		driver.close();

	}

}
