package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.BaseTest;

public class HelperList extends BaseTest{
public static Select ddlb;


	
	public static void SelectCountry() throws InterruptedException
	{
		
		  Select db=new Select (driver.findElement(By.id("dropdown")));
		     Thread.sleep(40000);
				db.selectByValue("CA");//SG IN LC AU NL VE		
		
	}

	public static void SelectPaymentTerm() throws InterruptedException
	{

		Select ptm=new Select(driver.findElement(By.xpath("//*[@id='payment_term']")));
		ptm.selectByValue("4");
	

	}
	
	public static void SelectCustomerType() throws InterruptedException
	{
		//Customer Type
		Select ct=new Select(driver.findElement(By.xpath("//*[@id='customer_type']")));
		ct.selectByValue("RESELLER");	

	}
	
	public static void SelectCustomerSubType() throws InterruptedException
	{
	//Select Customer Sub Type
	Select st=new Select(driver.findElement(By.xpath("//*[@id='customerSubType']")));
	st.selectByValue("STANDARD END USER");
	}
	public static void SelectIndustry() throws InterruptedException
	{
	Select industry=new Select(driver.findElement(By.id("industry")));
	industry.selectByValue("AG - GROUND APPLICATIONS");

	}
	public static void SelectPaymentMethod() throws InterruptedException
	{
	//Select Payment Method
			Select ms = new Select(driver.findElement(By.xpath("//*[@id='paymethod']")));
			ms.selectByValue("INVOICE");
	}	
	
	
	public static void SelectPosType() throws InterruptedException
	{
	Thread.sleep(3000);
	Select type = new Select(driver.findElement(By.id("st_c_postype")));
	type.selectByVisibleText("RTX");
	}
	
	public static void SelectManufact() throws InterruptedException
	{
	 //Select Manufacturer
       Select dropDown = new Select(driver.findElement(By.xpath("//*[@id='st_c_manufacturer']")));
       List < WebElement > e = dropDown.getOptions();
		dropDown.selectByVisibleText("Trimble");
	}
	public static void SelectService() throws InterruptedException
	{
	//Select Service
	Select dropDowns = new Select(driver.findElement(By.xpath("//*[@id='service0']")));
	List < WebElement > es = dropDowns.getOptions();
	dropDowns.selectByVisibleText("Ag Regional CenterPoint RTX Std 1 Year via Satellite");
	//dropDowns.selectByValue("1071377");
	}
	public static void SelectFirmware() throws InterruptedException
	{
	//Select Firmware
	Select firm= new Select(driver.findElement(By.id("firmwarever0")));
	firm.selectByValue("v1.31@@@GE [deprecated]:@@@Pre 2.0/6.5 fw (CFX/FmX)");
	}
	
	
	public static void SelectBroadcastType() throws InterruptedException
	{
	//Select Broadcast Type
	Select opt=new Select(driver.findElement(By.id("broadcasttype0")));
	opt.selectByValue("BOTH");
	}	
}


