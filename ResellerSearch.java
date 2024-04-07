package pages;

import org.openqa.selenium.By;

import util.BaseTest;

public class ResellerSearch extends BaseTest{

	
	public static void searchEmployee(String cn) throws InterruptedException
	{
			
		driver.findElement(By.id("xxcustomerby")).sendKeys(cn);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content']/form/table[3]/tbody/tr[1]/td[10]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='resultTable']/table/tbody/tr/td[1]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ownerSearchResult']")).click();
		Thread.sleep(10000);
	}
	
	
	

}
