package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.BaseTest;
import util.Helpers;
import pages.HelperList;
public class AccountHomeElements extends BaseTest{

	//-----------------------------------Locators--------------------------------//
	public static By CreateAccount=By.linkText("Create Account");
	public static By customerName=By.id("customer_name");
	public static By email_address=By.id("email_address");
	public static By first_name1=By.id("first_name");
	public static By last_name=By.id("last_name");
	public static By phone_number=By.id("phone_number");
	public static By address=By.xpath("//*[@id='ADDRESS1.ARRemit_Address_HZ']");
	public static By city=By.xpath("//*[@id='CITY.ARRemit_Address_HZ']");
	public static By province=By.xpath("//*[@id='PROVINCE.ARRemit_Address_HZ']");
	public static By prosearch=By.xpath("//*[@id='newLayout']/table/tbody/tr[14]/td[3]/a/img");
	public static By postalcodes=By.xpath("//*[@id='POSTAL_CODE.ARRemit_Address_HZ']");
	public static By Language=By.id("language");
	public static By TaxNo=By.id("tax_number");
	public static By createacc=By.xpath("//*[@id='regEnable']/fieldset");
	
	//-----------------------------------End of Locators--------------------------------//
	
	//-----------------------------------WebElements--------------------------------//
	
	public static WebElement lnk_createAcco()
	{
		return driver.findElement(CreateAccount);
	}
	
	public static WebElement eb_CustomerName()
	{
		return driver.findElement(customerName);
	}

	public static WebElement eb_EmailAdd()
	{
		return driver.findElement(email_address);
	}
	
	public static WebElement eb_FirstName()
	{
		return driver.findElement(first_name1);
	}
	
	public static WebElement eb_LastName()
	{
		return driver.findElement(last_name);
	}
	
	public static WebElement eb_phonenum()
	{
		return driver.findElement(phone_number);
	}
	
	public static WebElement eb_Address1()
	{
		return driver.findElement(address);
	}
	
	public static WebElement eb_city1()
	{
		return driver.findElement(city);
	}
	
	public static WebElement eb_province1()
	{
		return driver.findElement(province);				
	}
	
	public static WebElement eb_provincesear()
	{
		return driver.findElement(prosearch);				
	}
	
	public static WebElement eb_postalcode()
	{
		return driver.findElement(postalcodes);				
	}
	public static WebElement eb_lanuagese()
	{
		return driver.findElement(Language);
	}
	public static WebElement eb_Vattax()
	{
		return driver.findElement(TaxNo);
	}
		
	public static WebElement eb_createAccButton()
	{
		return driver.findElement(createacc);		
	}
				
}
