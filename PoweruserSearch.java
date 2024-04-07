package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import util.BaseTest;
import util.Helpers;

public class PoweruserSearch extends BaseTest {

	public static void searchorders(String cusnma) throws InterruptedException, IOException
		{
			
			driver.findElement(By.id("xxcustomerby")).sendKeys(cusnma);
			driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/form[4]/table/tbody/tr/td[2]/table[1]/tbody/tr[2]/td[2]/a/img")).click();
			Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id='resultTable']/table/tbody/tr/td[1]/div/input")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/form[4]/table/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr/td")).click();
			Thread.sleep(15000);
			Helpers.takeElementScreenshot();

	}
}
