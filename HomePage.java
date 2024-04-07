package pages;

import org.openqa.selenium.By;

import util.BaseTest;

public class HomePage extends BaseTest {

	//Navigate to Customer Care to Create New Account 
	
	public static void NavigateToCustomerCare() throws InterruptedException
	{
		driver.findElement(By.linkText("Customer Care")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='customerSearch']/table[3]/tbody/tr/td[4]/table/tbody/tr/td/button")).click();
	}
	
	
	
	
	//Navigate to Admin Page to Create New SSO USer
	public static void navigateToAdmin() throws InterruptedException
	{
		driver.findElement(By.linkText("Admin")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table[2]/tbody/tr/td[2]/form[2]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/input")).click();
		Thread.sleep(2000);


		}
	
	
	//Navigate to SalesOrder  to Create New Order
	public static void NavigateToSalesOrder() throws InterruptedException
	{
	driver.findElement(By.linkText("Sales Order Workbench")).click();
		
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table[2]/tbody/tr/td[2]/form[2]/table[4]/tbody/tr/td[2]/table/tbody/tr/td/input")).click();
		//Thread.sleep(2000);
	}
	
	//Navigate to Reseller store Searchworkbench to search Orders
	public static void NavigateToDealerSW() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.linkText("Search Workbench")).click();
			}
	//Navigate to Poweruser store Searchworkbench to search Orders
	public static void NavigateToPowerUserSW() throws InterruptedException
	{
		driver.findElement(By.linkText("Search Workbench")).click();
		Thread.sleep(4000);
	}
	
	//NavigateToQuickSearch

	//Logout from the store
	public static void appLogout() throws InterruptedException
	{
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
}
