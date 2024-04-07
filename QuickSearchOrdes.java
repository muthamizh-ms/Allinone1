package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.BaseTest;

public class QuickSearchOrdes extends BaseTest {
	public static void 	SearchOrderQC (String cuno) throws InterruptedException
	{
	
		driver.findElement(By.linkText("Quick Search")).click();
		Thread.sleep(1000);
	driver.findElement(By.name("customer_number")).sendKeys(cuno);
	driver.findElement(By.xpath("//*[@id='quickSrch']/tbody/tr/td[6]/a")).click();
	//driver.findElement(By.name("posid1")).sendKeys("");	
	
	Thread.sleep(6000);
WebElement element = driver.findElement(By.name("Search"));
Actions actio = new Actions(driver);
actio.moveToElement(element).click().perform();

}
}
