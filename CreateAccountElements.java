package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.BaseTest;

public class CreateAccountElements extends BaseTest{

	//-----------------------------------Locators--------------------------------//
	public static By createAccount=By.linkText("Create Account");
	public static By customerName=By.id("customer_name");
	public static By cutomerShortName=By.id("customer_short_name");
	public static By payementTerm=By.id("payment_term");
	public static By customerType=By.xpath("//*[@id='customer_type']");
	public static By cus_sub_type=By.id("customerSubType");
	public static By city=By.xpath("//*[@id='CITY.ARRemit_Address_HZ']");
	public static By address=By.xpath("//*[@id='ADDRESS1.ARRemit_Address_HZ']");
	public static By province=By.xpath("//*[@id='PROVINCE.ARRemit_Address_HZ']");
	public static By search=By.xpath("//*[@id='maitainCustomer']/table/tbody/tr/td[2]/table[2]/tbody/tr[13]/td[3]/a/img");
	public static By postalCode=By.xpath("//*[@id='POSTAL_CODE.ARRemit_Address_HZ']");
	public static By createButton=By.xpath("//*[@id='createCustBtnEnable']/table/tbody/tr/td/button");
	public static By contactFirstName=By.id("cont_first_name");
	public static By contactlastName=By.id("cont_last_name");
	public static By contact_comn0=By.id("contact_comn0");
	public static By cont_email0=By.id("cont_email0");
	public static By contact_comn1=By.id("contact_comn1");
	public static By cont_mobile1=By.id("cont_mobile1");
	public static By email_invoice=By.id("email_invoice");
	public static By addContact=By.xpath("//*[@id='addContactBtn']/table/tbody");
	
	//-----------------------------------End of Locators--------------------------------//
	
	//-----------------------------------WebElements--------------------------------//
	public static WebElement lnk_CreateAccount()
	{
		return driver.findElement(createAccount);
	}
	
	public static WebElement eb_CustomerName()
	{
		return driver.findElement(customerName);
	}
	
	public static WebElement eb_CustomerShortName()
	{
		return driver.findElement(cutomerShortName);
	}

	public static WebElement dd_PaymentTerm()
	{
		return driver.findElement(payementTerm);
	}
	
	public static WebElement dd_customerType()
	{
		return driver.findElement(customerType);
	}
	
	public static WebElement dd_customerSubType()
	{
		return driver.findElement(cus_sub_type);
	}
	
	public static WebElement eb_city()
	{
		return driver.findElement(city);
	}
	
	public static WebElement eb_address()
	{
		return driver.findElement(address);
	}

	public static WebElement eb_province()
	{
		return driver.findElement(province);
	}
	
	public static WebElement eb_provincesearch1()
	{
		return driver.findElement(search);
	}
	
	public static WebElement eb_postalcode()
	{
		return driver.findElement(postalCode);
	}
	public static WebElement eb_firstname()
	{
		return driver.findElement(contactFirstName);
	}
	
	public static WebElement eb_lastname()
	{
		return driver.findElement(contactlastName);
	}
	
	public static WebElement eb_contactemail()
	{
		return driver.findElement(contact_comn0);
	}
	//select click radio button
	
	public static WebElement eb_contactemailclick()
	{
		return driver.findElement(cont_email0);
	}
	
	public static WebElement eb_contactphone()
	{
		return driver.findElement(contact_comn1);
	}
	
	public static WebElement eb_contactphoneclick()
	{
		return driver.findElement(cont_mobile1);
	}
	public static WebElement eb_provincesearch()
	{
		return driver.findElement(search);
	}
	
	public static WebElement eb_createButtonClick()
	{
		return driver.findElement(createButton);
	}
	
	public static WebElement eb_emailinvoicecheckboxclick()
	{
		return driver.findElement(email_invoice);
	}
	
	public static WebElement eb_addcontacbutton()
	{
		return driver.findElement(addContact);
	}
	
	//-----------------------------------End of WebElement--------------------------------//
}

