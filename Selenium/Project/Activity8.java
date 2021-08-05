package project;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.id("wp-submit")).submit();
		
		
			WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Howdy')]")));
			login.click();
			
			WebElement userName = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user_login"))));
			
			System.out.println(userName.getAttribute("value"));
			
			if(userName.getAttribute("value").matches("root")) {
				System.out.println("Login  sucessfully ");
			}
		
			else{
				System.out.println("Login not sucessfully ");
			}
		
			driver.close();
		

	}

}
