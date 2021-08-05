package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.id("wp-submit")).submit();
		
		Thread.sleep(10000);
		
		WebElement joblisting = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]"))));
		joblisting.click();
			
		driver.findElement(By.className("page-title-action")).click();
		
		driver.findElement(By.id("post-title-0")).sendKeys("TEST");
		
		driver.findElement(By.name("_application")).clear();
		driver.findElement(By.name("_application")).sendKeys("test@in.com");
		
		driver.findElement(By.name("_job_location")).sendKeys("AP");
		
		driver.findElement(By.cssSelector("button.components-button:nth-child(3)")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".editor-post-publish-button")).click();
		
		driver.findElement(By.cssSelector(".edit-post-fullscreen-mode-close")).click();
		driver.findElement(By.id("post-search-input")).sendKeys("TEST",Keys.ENTER);
		
		String name = driver.findElement(By.cssSelector("#post-3688 > td:nth-child(2) > div:nth-child(1) > a:nth-child(1)")).getText();
		
		if(name.matches("TEST")) {
			
			String location = driver.findElement(By.cssSelector("#post-3695 > td:nth-child(4) > a:nth-child(1)")).getText();
			
			if(location.matches("AP"))	
			    System.out.println("Job added successfully");
		}
		else {
			System.out.println("Job not added successfully");
		}
		
		//driver.close();
		
		
		
		
		
	

	}

}
