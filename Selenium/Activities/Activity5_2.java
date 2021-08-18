package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title of the page is: " + driver.getTitle());
		
		System.out.println("Is the checkbox ticked ? " +driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input")).click();
		System.out.println("Is the checkbox ticked ? " +driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input")).isSelected());
		driver.close();
	

	}

}
