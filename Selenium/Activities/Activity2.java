package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/");
		
		System.out.println("Title ofthe page is: "+driver.getTitle());
		
		WebElement xpath = 	driver.findElement(By.xpath("//*[@id=\"about-link\"]"));
		System.out.println("Using Xpath:" + xpath.getText());
		
		WebElement idloc =driver.findElement(By.id("about-link"));
		System.out.println("Using ID as loc:" + idloc.getText());
		
		WebElement classname = driver.findElement(By.className("green"));
		System.out.println("Using classname  as loc:" + classname.getText());	
		
		
		WebElement csselector = driver.findElement(By.cssSelector("#about-link"));
		System.out.println("Using cssslector as loc:" + csselector.getText());
		
		WebElement linktext = driver.findElement(By.linkText("About Us"));
		System.out.println("Using linktext as loc:" + linktext.getText());
		
		driver.close();

	}

}
