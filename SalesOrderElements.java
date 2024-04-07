package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.BaseTest;

public class SalesOrderElements extends BaseTest{
	//-----------------------------------Locators--------------------------------//
	
	public static By CustName=By.id("custdetailcustname");
	public static By CustPopClick=By.xpath("//*[@id='custpopupcustnamediv']/a");
	public static By CustOkButton=By.xpath("//*[@id='custdetailpopupForm']/table[6]/tbody/tr[2]/td[11]/table/tbody");
	public static By ResellerField=By.id("reseller");
	public static By IconSearch=By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/form[3]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/a/img");
	public static By eventClick=By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/form[3]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/a");
	public static By Posidenter=By.id("posid0");
	public static By PencilIconClick=By.xpath("//*[@id='subrow0']/td[2]/a");
	public static By Manufact=By.id("st_c_manufacturer");
	public static By ModelIconclick=By.xpath("//*[@id='nrml_frm1']/table/tbody/tr[2]/td[2]/a/img");
	public static By ModelradioButton=By.xpath("//*[@id='stc_modelresultTable']/table/tbody/tr[8]/td[1]/input");
	public static By EnableButton=By.xpath("//*[@id='enableExecCreateBtn']/table/tbody");
	public static By ServiceSelect=By.id("service0");
	public static By TermsClick=By.xpath("//*[@id='termsandcondition']");
	public static By AutoRenewalPopaccept=By.xpath("//*[@id='autoRenewal']/table[2]/tbody/tr[1]/td[2]/input");
	public static By ProcessButton=By.xpath("//*[@id='placeorderbuttondiv']/table/tbody/tr/td/table/tbody/tr/td/button");
	public static By ContactPopup=By.xpath("//*[@id='orderByContactPopup']/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td/button");
	public static By Invoiceoptionclick=By.id("invoicenow");
	public static By SubmitButton=By.xpath("//*[@id='placeOrderPopup']/form/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td/button");
	public static By Firmwaresubmit=By.xpath("//*[@id='rtxfirmwareinfopopup']/table[4]/tbody/tr[2]/td[2]/table/tbody/tr/td/button");
	public static By Sendmailclick=By.linkText("Send email");
	public static By Clickok=By.xpath("//*[@id='broadCastEmailPopup']/table[3]/tbody/tr[2]/td[2]/table");
	
	//-----------------------------------End of Locators--------------------------------//
	
	//-----------------------------------WebElements--------------------------------//
	
	public static WebElement eb_CustomerNameenter()
	{
		return driver.findElement(CustName);
	}
	
	public static WebElement eb_CustomerPopup()
	{
		return driver.findElement(CustPopClick);
	}
	
	public static WebElement eb_Customerok()
	{
		return driver.findElement(CustOkButton);
	}
	
	public static WebElement eb_ResellerValue()
	{
		return driver.findElement(ResellerField);
	}
	
	public static WebElement eb_SearchIcon()
	{
		return driver.findElement(IconSearch);
	}
	
	public static WebElement eb_EnterPosId()
	{
		return driver.findElement(Posidenter);
	}
	
	public static WebElement eb_clickPencil()
	{
		return driver.findElement(PencilIconClick);
	}
	
	public static WebElement eb_clickevents()
	{
		return driver.findElement(eventClick);
	}
	
	public static WebElement eb_Manufacuter()
	{
		return driver.findElement(Manufact);
	}
	
	public static WebElement eb_Modelswindow()
	{
		return driver.findElement(ModelIconclick);
	}
	
	public static WebElement eb_ModelSelect()
	{
		return driver.findElement(ModelradioButton);
	}
	
	public static WebElement eb_EnableButton()
	{
		return driver.findElement(EnableButton);
	}
	
	public static WebElement eb_ServiceSelection()
	{
		return driver.findElement(ServiceSelect);
	}
	
	public static WebElement eb_ClickTerms()
	{
		return driver.findElement(TermsClick);
	}
	
		public static WebElement eb_AutorenewalPopupselection()
	{
		return driver.findElement(AutoRenewalPopaccept);
	}
	
	public static WebElement eb_ProcessorderButton()
	{
		return driver.findElement(ProcessButton);
	}
	public static WebElement eb_aknowledgepopup()
	{
		return driver.findElement(ContactPopup);
	}
	
	public static WebElement eb_InvoiceOptionselection()
	{
		return driver.findElement(Invoiceoptionclick);
	}
	
	public static WebElement eb_ButtonSubmit()
	{
		return driver.findElement(SubmitButton);
	}
		
	public static WebElement eb_Firmwareselect()
	{
		return driver.findElement(Firmwaresubmit);
	}
	
	public static WebElement eb_Sendmaillink()
	{
		return driver.findElement(Sendmailclick);
	}
	
	public static WebElement eb_MailsendOk()
	{
		return driver.findElement(Clickok);
	}
	
	
	//-----------------------------------End of WebElement--------------------------------//
}
