package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseTest {
public static WebDriver driver;
public static void BrowserOpen(String bname)
{
	switch (bname.toLowerCase())
	{
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
//	case "opera":
//		System.setProperty("webdriver.opera.driver", "C:\\automation\\drivers\\chromedriver_win32\\chromedriver.exe");
//		driver = new OperaDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
}
public static void appLaunch(String url)
{
	driver.get(url);
}


public static void browserClose()
{
	driver.quit();
}
}
