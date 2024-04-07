package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.BaseTest;

public class QuickSearchRenewalElements extends BaseTest {

	//-----------------------------------Locators--------------------------------//
		public static By QuickSearchTab=By.linkText("Quick Search");
		public static By CustomerNumber=By.name("customer_number");
		public static By SearchIconclick=By.xpath("//*[@id='quickSrch']/tbody/tr/td[6]/a");
		public static By SelectPOSIDCheckbox=By.id("chkBox3");
		public static By ClickButtonrenew=By.xpath("//*[@id=\'srcElement\']/table[3]/tbody/tr/td[2]/button");
		//public static By
		public static By Reseller=By.id("reseller");
		public static By ResellerIconClick=By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/form[3]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/a");
		public static By TermsCheck=By.xpath("//*[@id='subscriptiondiv']/table[2]/tbody/tr/td[7]");
		public static By ProcessOrderButton=By.xpath("//*[@id='placeorderbuttondiv']/table/tbody/tr/td/table");
		public static By OrderAck=By.xpath("//*[@id='orderByContactPopup']/table[3]/tbody/tr[2]/td[2]/table/tbody");
		public static By SelectInv=By.id("invoicenow");
		public static By SubmitButton=By.name("Submit");
		public static By ClickSub=By.xpath("//*[@id='rtxfirmwareinfopopup']/table[2]/tbody/tr/td[2]/table/tbody/tr/td/button");
		
		//-----------------------------------End of Locators--------------------------------//
		
		//-----------------------------------WebElements--------------------------------//
		
		
		public static WebElement lnk_clickQuicksearch()
		{
			return driver.findElement(QuickSearchTab);
		}
		
		public static WebElement eb_EnterCustomerNumber()
		{
			return driver.findElement(CustomerNumber);
		}
		
		public static WebElement eb_Searchclick()
		{
			return driver.findElement(SearchIconclick);
		}
		
		public static WebElement eb_selectPOSId()
		{
			return driver.findElement(SelectPOSIDCheckbox);
		}
		

		public static WebElement eb_clickRenewbutton()
		{
			return driver.findElement(ClickButtonrenew);
		}
		public static WebElement eb_enterReseller()
		{
			return driver.findElement(Reseller);
		}
		
		public static WebElement eb_clickResellerClick()
		{
			return driver.findElement(ResellerIconClick);
		}
			
		public static WebElement eb_TermsClick()
		{
			return driver.findElement(TermsCheck);
		}
		
		public static WebElement eb_ProcessButton()
		{
			return driver.findElement(ProcessOrderButton);
		}
		
		public static WebElement eb_OrderEmail()
		{
			return driver.findElement(OrderAck);
		}
		
		public static WebElement eb_InvoiceOption()
		{
			return driver.findElement(SelectInv);
		}
		
		public static WebElement eb_SubmitAccess()
		{
			return driver.findElement(SubmitButton);
		}
		
		public static WebElement eb_Clicksu()
		{
			return driver.findElement(ClickSub);
		}
				
		//-----------------------------------End of WebElement--------------------------------//
	}
