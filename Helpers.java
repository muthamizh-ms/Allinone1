package util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers extends BaseTest{
	public static Select ddlb;
	public static WebDriverWait wait;
	public static Actions act;


	public static void enterValue(WebElement ele, String value)
	{
		ele.sendKeys(value);
	}
	
	public static void enterValueTab(WebElement ele, String value)
	{
		ele.sendKeys(value);
		act=new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
	}
	
	
	public static void click(WebElement ele)
	{
		ele.click();
	}
	
	public static void clear(WebElement ele)
	{
		ele.clear();
	}
	
	public static void selectValue(String selectType,WebElement ele, String value)
	{
		ddlb = new Select(ele);
		switch (selectType.toUpperCase())
		{
		case "VISBILETEXT":
			ddlb.selectByVisibleText(value);
			break;
		case "VALUE":
			ddlb.selectByValue(value);
			break;
		case "INDEX":
			ddlb.selectByIndex(Integer.parseInt(value));
			break;
		}
		
	}
	
	public static void selectValueLB(String selectType,WebElement ele, String value[])
	{
		ddlb = new Select(ele);
	
		switch (selectType.toUpperCase())
		{
			case "VISBILETEXT":
				for (int i=0;i<value.length;i++)
				{
				ddlb.selectByVisibleText(value[i]);
				}
			break;

	
			case "VALUE":
				for (int i=0;i<value.length;i++)
				{
				ddlb.selectByValue(value[i]);
				}
			break;

	
			case "INDEX":
				for (int i=0;i<value.length;i++)
				{
				ddlb.selectByIndex(Integer.parseInt(value[i]));
				}
			break;

		}
	}
	
	public static String handleAlert(String alertOperation)
	{
		switch(alertOperation.toUpperCase())
		{
		case "OK":
			driver.switchTo().alert().accept();
		break;
		
		case "CANCEL":
			driver.switchTo().alert().dismiss();
		break;
	
		}
		
		return driver.switchTo().alert().getText();
	}
	
	public static void waitForElement(By locator, int seconds)
	{
		wait=new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static void waitForElement(String waitType, By locator, int seconds)
	{
		wait=new WebDriverWait(driver, seconds);
		
		switch(waitType.toUpperCase())
		{
		case "VISIBILITY":
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			Helpers.staticWait(2);
			
		break;
		
		case "INVISIBILITY":
			Helpers.staticWait(2);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		break;
			
		}
		
	}
	
	public static void staticWait(int second)
	{
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//StaticWait Catch
		}
	}
	
	public static void moveToElement(WebElement ele)
	{
		act.moveToElement(ele).build().perform();
	}
	public static void moveAndClick(WebElement ele)
	{
		act.moveToElement(ele).click().build().perform();

	}
	
	
	
	
	public static void takeElementScreenshot() throws IOException {

		TakesScreenshot ts=(TakesScreenshot)driver;
		File stsFile=ts.getScreenshotAs(OutputType.FILE);
		File dstFile= new File("C:\\Selenium\\screens\\ms.png");
		FileHandler.copy(stsFile, dstFile);
		
		//File srcFile = element.getScreenshotAs(OutputType.FILE);
//		try {
//	//	FileUtils.copyFile(srcFile, new File("./target/screenshots/"+fileName + ".jpeg"));
//			
//		FileHandler.copy(srcFile, new File("./target/screenshots/"+fileName + ".jpeg"));
//			
//		} catch (IOException e) {
//		e.printStackTrace();
//		}
	
	}
}

