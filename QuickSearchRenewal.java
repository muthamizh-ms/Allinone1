package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import pageElements.QuickSearchRenewalElements;
import util.Helpers;

public class QuickSearchRenewal extends QuickSearchRenewalElements{
	
	public static void 	RenewalOrder (String customernumber,String Reseller) throws InterruptedException
	{
	
		Helpers.click(lnk_clickQuicksearch());
		Helpers.enterValue(eb_EnterCustomerNumber(),customernumber);
				Helpers.click(eb_Searchclick());
		Thread.sleep(7000);
	//	WebElement element = driver.findElement(By.name("Search"));
		//Actions actio = new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id='srcElement']/table[2]/tbody/tr/td[3]/button")).click();
		
	//	actio.moveToElement(element).click().perform();
		Helpers.click(eb_selectPOSId());
		Helpers.click(eb_clickRenewbutton());
		Thread.sleep(40000);
		Select ms = new Select(driver.findElement(By.xpath("//*[@id='paymethod']")));
		ms.selectByValue("INVOICE");
		//HelperList.SelectPaymentMethod();
		Thread.sleep(10000);
	//	HelperList.SelectPaymentTerm();
		Select ptm=new Select(driver.findElement(By.xpath("//*[@id='payment_term']")));
		ptm.selectByValue("4");
	
		// Samplehotelprogram.dd_select(driver.findElement(By.xpath("//select[@name='location']")),"Sydney");
	
			//Helpers.selectValue(PaymentTerm, PaymentTerm, PaymentTerm);
			//Helpers.selectValue("value", By.id(), PaymentTerm);
	//Helpers.selectValue("VALUE",driver.findElement(By.id("paymentterms")), PaymentTerm);
		
		
		Thread.sleep(4000);;
		Helpers.enterValue(eb_enterReseller(), Reseller);
		Helpers.click(eb_clickResellerClick());
		Helpers.click( eb_TermsClick());
		Helpers.click(eb_ProcessButton());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Helpers.click(eb_OrderEmail());
		Helpers.click(eb_InvoiceOption());
		Helpers.click(eb_SubmitAccess());
		Helpers.click(eb_Clicksu());	

	}

}