package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.BaseTest;

public class NewSsoUserElements extends BaseTest{
	//-----------------------------------Locators--------------------------------//
	
	public static By Admin=By.linkText("Admin");
	public static By CreateuserButton=By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table[2]/tbody/tr/td[2]/form[2]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/input");
	public static By CustName=By.xpath("//*[@id='custName']");
	public static By NameSearch=By.xpath("/html/body/table[4]/tbody/tr[1]/td[2]/form/table[3]/tbody/tr[2]/td[2]/a/img");
	public static By FirstName=By.name("firstname");
	public static By LastName=By.name("lastname");
	public static By EmailAddress=By.name("email");
	public static By PhoneNum=By.name("phoneNumber");
	public static By VrsCheckbox=By.id("vrsNowUser");
	public static By LanguageSelect=By.id("userLanguage");
	public static By regioncheckbox=By.id("region5");
	public static By CreateUserButton=By.xpath("/html/body/table[4]/tbody/tr[1]/td[2]/form/table[5]/tbody/tr/td[2]/table/tbody/tr/td/input");
	
	//-----------------------------------End of Locators--------------------------------//
	
	//-----------------------------------WebElements--------------------------------//
	
	public static WebElement lnk_Admin()
	{
		return driver.findElement(Admin);
	}
	
	public static WebElement eb_ButtonClick()
	{
		return driver.findElement(CreateuserButton);
	}
	
	public static WebElement eb_CustomerName()
	{
		return driver.findElement(CustName);
	}
	
	public static WebElement eb_Searchclick()
	{
		return driver.findElement(NameSearch);
	}
	
	public static WebElement eb_FName()
	{
		return driver.findElement(FirstName);
	}
	
	public static WebElement eb_LName()
	{
		return driver.findElement(LastName);
	}
	
	public static WebElement eb_EmailId()
	{
		return driver.findElement(EmailAddress);
	}
	
	public static WebElement eb_PhoneN()
	{
		return driver.findElement(PhoneNum);
	}
		
	public static WebElement eb_Checboxclick()
	{
		return driver.findElement(VrsCheckbox);
	}
	
	
	public static WebElement eb_regionclick()
	{
		return driver.findElement(regioncheckbox);
	}
	
	public static WebElement eb_CreateButtonclick()
	{
		return driver.findElement(CreateUserButton);
	}
	
	
	public static WebElement dd_LanguageSelect()
	{
		return driver.findElement(LanguageSelect);
	}
	//-----------------------------------End of WebElement--------------------------------//
}
