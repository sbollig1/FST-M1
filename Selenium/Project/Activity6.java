package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.get("https://alchemy.hguy.co/jobs/");
		
		System.out.println("The Current URL is: "+ driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
		
		String title = driver.getTitle();
		
		if(title.matches("Jobs – Alchemy Jobs")) {
			System.out.println(" The URL after clicking on jobs is :: "+ driver.getCurrentUrl());
			driver.findElement(By.id("search_keywords")).sendKeys("Banking");
			driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
			
						
			/*WebElement list;
			
			list = driver.findElements(By.className("job_listings")).get(1);
			System.out.println();*/
			
			Thread.sleep(500);
			driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input")).click();
			
			WebElement email = driver.findElement(By.xpath("//*[@id=\"post-3526\"]/div/div/div/div[3]/div/p/a")); 
			wait.until(ExpectedConditions.visibilityOf(email));
			
			System.out.println(" The email provided to aply is:: "+ email.getText());
			
			System.out.println("The Title of Curent page is: "+ title);
			driver.close();
		}
		
		else {
			System.out.println("The Jobs page is not the one as expected");
		}


	}

}
