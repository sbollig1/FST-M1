package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		System.out.println("Title of the page is: " + driver.getTitle());
		
		System.out.println("The Header is :" +driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText());
		System.out.println("The Color of the button is "+ driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color"));
		System.out.println("The classes of the utton is " +driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class"));
		System.out.println("The Color of Button is: "+ driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());
		
		driver.close();
		
	}

}
