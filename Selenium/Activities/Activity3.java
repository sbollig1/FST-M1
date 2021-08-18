package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/simple-form");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("firstName")).sendKeys("Srilekha");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("B");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("123@ww.com");
		Thread.sleep(1000);
		driver.findElement(By.id("number")).sendKeys("12345689");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input")).submit();
		
		driver.close();

	}

}
