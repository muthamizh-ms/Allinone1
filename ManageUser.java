package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageElements.CommonElements;
import pageElements.NewSsoUserElements;
import util.Helpers;

public class ManageUser extends NewSsoUserElements{
	public static void Adduser(String customername, String firstname, String lastname, String emailaddress, String phonenumb) throws InterruptedException
	{
		try
		{
		Helpers.click( lnk_Admin());
		Helpers.click(eb_ButtonClick());
		Helpers.enterValue(eb_CustomerName(), customername);
		Helpers.click(eb_Searchclick());
		Helpers.staticWait(05);
		Helpers.enterValue(eb_FName(), firstname);
	   	Helpers.enterValue(eb_LName(), lastname);
		Helpers.enterValueTab(eb_EmailId(), emailaddress);
		Thread.sleep(2000);
		WebElement webElement = driver.findElement(By.id("email"));
		 webElement.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
	
		Helpers.enterValue(eb_PhoneN(), phonenumb);
//		Helpers.click(eb_Checboxclick());
//		Helpers.staticWait(60);
		//Helpers.selectValue("VISIBILE", dd_LanguageSelect(), "ENGLISH");
	//	Helpers.selectValue("VISIBLE", ele, value);
		//Helpers.waitForElement("Invisibility", CommonElements.loadingLogo, 80);		
		Helpers.click(eb_regionclick());
		Helpers.staticWait(40);
		Helpers.click(eb_CreateButtonclick());		
		Helpers.staticWait(40);
		//wait.until(ExpectedConditions.
		}
		catch (Exception et)
		{
			System.out.println(et);
		}
}
}

