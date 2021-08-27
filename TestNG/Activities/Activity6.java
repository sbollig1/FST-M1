package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
	
	WebDriver driver;
	
  @Test
  @Parameters({"username", "password"})
  public void param(String username, String password) {
	  
	  WebElement usernameField = driver.findElement(By.id("username"));
      WebElement passwordField = driver.findElement(By.id("password"));
      
      //Enter values
      usernameField.sendKeys(username);
      passwordField.sendKeys(password);
      
      //Click Log in
      driver.findElement(By.cssSelector("button[type='submit']")).click();
      
      //Assert Message
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals(loginMessage, "Welcome Back, admin");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
