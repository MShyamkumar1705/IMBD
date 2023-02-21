import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility.FileUtility;
import com.Generic.Utility.WebdriverUtility;
import com.Generic.Utility.iPathConstants;
import com.Imbd.PageObject.BaseClassImbd;
import com.Imbd.PageObject.FetchMovie;
import com.Imbd.PageObject.GooglePage;
import com.Imbd.PageObject.IMBDHomePage;

public class MainTest  {
	static WebDriver driver;
	public WebdriverUtility wLib=new WebdriverUtility();
	public FileUtility fLib=new FileUtility();
	@Test
	public void mainExecution() throws Throwable {
		driver=new ChromeDriver();
		driver.get(iPathConstants.file);
		wLib.maximizePage(driver);
		wLib.imPlicitWait(driver);
		GooglePage gp=new GooglePage(driver);
		gp.searchBox();
		IMBDHomePage iM=new IMBDHomePage(driver);
		iM.enterPusphaPage();
		
		FetchMovie fm=new FetchMovie(driver);
		fm.validate(driver);
	}

}
