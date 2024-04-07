package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageElements.AccountHomeElements;
import util.Helpers;

public class AccountFromHome extends AccountHomeElements{
	
	public static void addNewAccount(String cn,String em, String fn, String ln, String ph, String Add, String City, String Province, String Po, String Lang,String Vat) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		Helpers.click(lnk_createAcco());
		Helpers.enterValue(eb_CustomerName(), cn);
	   	Helpers.enterValue(eb_EmailAdd(), em);
	   	Thread.sleep(6000);
	  //wait.until(ExpectedConditions.invisibilityOfElementLocated((By) driver.findElement(By.id("email_address"))));
	 	Helpers.enterValue(eb_FirstName(),fn);
		Helpers.enterValue(eb_LastName(), ln);
		Helpers.enterValue(eb_phonenum(), ph);
		HelperList.SelectCountry();
		Thread.sleep(4000);
		Helpers.enterValue(eb_Address1(), Add);
		Helpers.enterValue(eb_city1(), City);
		Helpers.enterValue(eb_province1(), Province);
		Helpers.click(eb_provincesear());
		Thread.sleep(4000);
		Helpers.enterValue(eb_postalcode(), Po);
		Helpers.selectValue("value", eb_lanuagese(), Lang);
		Helpers.selectValue("value", eb_Vattax(), Vat);
		Helpers.click(eb_createAccButton());	
		
		
	
}
	
}