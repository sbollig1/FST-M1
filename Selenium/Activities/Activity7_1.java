package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("The Title of the page is "+ driver.getTitle());
		
		driver.findElement(By.cssSelector("[class^=\"username-\"")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class,'password-')]")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
		
		WebElement welmsg = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("action-confirmation"))));
		
		System.out.println(welmsg.getText());

	}

}
