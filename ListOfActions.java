package genericWrapper;

import java.io.IOException;

import pages.AccountFromHome;
import pages.CreateCustomer;
import pages.CreateSalesOrder;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageUser;
import pages.PoweruserSearch;
import pages.QuickSearchOrdes;
import pages.QuickSearchRenewal;
import pages.ResellerSearch;
import util.BaseTest;

public class ListOfActions 
{
	public static void selectStep(String keyword, String datas) throws InterruptedException, IOException
	{
		String value[]=datas.split(";;");
		switch(keyword.toUpperCase())
		{
		case "BROWSEROPEN":
			BaseTest.BrowserOpen(value[0]);
		break;
		
//		case "BROWSERCLOSE":
//			BaseTest.browserClose();
//		break;
		
		case "APPLICATIONLAUNCH":
			//BaseTest.appLaunch("https://opensource-demo.orangehrmlive.com/");
			BaseTest.appLaunch(value[0]);
		break;
		
//		case "APPLOGIN":
//		
//		LoginPage.loginPoweruser(value[0], value[1]);
//		//LoginPage.loginPowerdealer(value[0], value[1]);
//		break;
		
		case "APPSLOGIN":
			LoginPage.loginPowerdealer(value[0], value[1]);
			break;
		case "APPLOGOUT":
			HomePage.appLogout();
		break;
		
		case "NAVIGATETOCUSTOMERCARE":
			HomePage.NavigateToCustomerCare();
			
		break;
			case "NAVIGATETOADMINPAGE":
			HomePage.navigateToAdmin();
		break;
		
			case "NAVIGATETOSALESORDER":
			HomePage.NavigateToSalesOrder();
			break;
	
			case "NAVIGATETODEALERSW":
			HomePage.NavigateToDealerSW();
			break;
		
			case "SEARCHORDERD":
				ResellerSearch.searchEmployee(value[0]);
			break;
			
	
		
			case "NEWUSER":
			ManageUser.Adduser(value[0],value[1], value[2], value[3], value[4]);
	
			break;
			
			case "NAVIGATETOPOWERUSERSW":
				HomePage.NavigateToPowerUserSW();
			break;
			

			
			
			
			case "SEARCHORDERSPU":
				PoweruserSearch.searchorders(value[0]);
			break;
			
//			case "NEWORDER":
//				CreateSalesOrder..NewOrder(value[0], value[1], value[2]);
		
	case "NEWCUSTOMER":
			//CreateAccount.addCustomer(value[0],value[1],value[2],value[3],value[4],value[5],value[6],value[7],value[8],value[9]);
			CreateCustomer.addCustomer(value[0], value[1], value[2], value[3], value[4], value[5], value[6], value[7], value[8], value[9], value[10],value[10]);	
		break;
	

	case "SEARCHORDERQC":
		QuickSearchOrdes.SearchOrderQC(value[0]);
		
		break;
		
	case "RENEWORDER":
		QuickSearchRenewal.RenewalOrder(value[0], value[1]);
		
			break;
			
	case "NEWACCOUNT":
		AccountFromHome.addNewAccount(value[0], value[1], value[2], value[3], value[4], value[5], value[6], value[7], value[8],value[9],value[10]);
			break;
			
		}
	}

}
