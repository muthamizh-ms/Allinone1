package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import util.BaseTest;

public class LoginPage extends BaseTest{
	public static void loginPoweruser(String un,String pwd) throws InterruptedException
	{	
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();

		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Shop by Departments   »"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'POS  Trimble AM Power User')]")).click();
		Thread.sleep(1000);
	}
	
	
	public static void loginPowerdealer(String un,String pwd) throws InterruptedException
	{	
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id='fm1']/div[4]/input[4]")).click();
		
	}
					
	}
	
