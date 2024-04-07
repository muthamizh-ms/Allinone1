package pages;

import pageElements.CreateAccountElements;
import util.Helpers;

public class CreateCustomer extends CreateAccountElements{
	
	
		public static void addCustomer(String cn,String sn, String reseller,String Subtype, String add, String city, String pro,  String po, String fns, String lns, String email1, String pho) throws InterruptedException
		{
			
			Helpers.enterValue(eb_CustomerName(), cn);
			Helpers.enterValue(eb_CustomerShortName(), sn);
			Helpers.waitForElement(payementTerm, 10);
			Helpers.selectValue("Value", dd_PaymentTerm(), "4");
			Helpers.waitForElement(payementTerm, 10);
		//	HelperList.SelectCustomerType();
			Helpers.selectValue("Value", dd_customerType(), reseller);
			
			HelperList.SelectCountry();
			Helpers.staticWait(4);
			Helpers.enterValue(eb_address(), add);
			Helpers.enterValue(eb_city(), city);
			Helpers.enterValue(eb_province(), pro);
			Thread.sleep(30000);
			Helpers.click(eb_provincesearch());
			Thread.sleep(30000);
			//Helpers.waitForElement(province, 60);
			Helpers.enterValue(eb_postalcode(), po);
			//HelperList.SelectCustomerSubType();
			Helpers.selectValue("value", dd_customerSubType(), Subtype);
			Thread.sleep(4000);
			Helpers.selectValue(email1, null, pho);
			HelperList.SelectIndustry();
			Thread.sleep(20000);
			Helpers.click(eb_createButtonClick());
			Thread.sleep(20000);
			Helpers.waitForElement(contactFirstName, 30);
			Helpers.enterValue(eb_firstname(), fns);
			Helpers.enterValue(eb_lastname(), lns);
			Helpers.enterValue(eb_contactemail(), email1);
			Helpers.click(eb_contactemailclick());
			Helpers.enterValue(eb_contactphone(), pho);
			Helpers.click(eb_contactphoneclick());
			Helpers.click(eb_emailinvoicecheckboxclick());
			Helpers.click(eb_addcontacbutton());
			
				}

	}
