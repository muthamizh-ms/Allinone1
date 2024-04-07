package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.BaseTest;

public class CommonElements extends BaseTest{

	//public static By loadingLogo=By.xpath("//img[@src='/OA_MEDIA/tcs_ajax-loader.gif']");
	public static By loadingLogo=By.xpath("//*[@id='loadImg']");
//	/OA_MEDIA/tcs_ajax-loader.gif
	public static WebElement img_LoadingLOGO()
	{
		return driver.findElement(loadingLogo);
	}
			
}