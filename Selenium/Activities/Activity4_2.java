package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println("Title of the page is: " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Srilekha");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Bolligarla");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sdc@email.com");
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input")).submit();
		
		driver.close();

	}

}
