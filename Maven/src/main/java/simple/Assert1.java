package simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert1 {
	WebDriver driver = new ChromeDriver();
	@Test (priority = 0)
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = -1)
	   
    public void OpenBrowser() {
        
        driver.get("https://toolsqa.com/");
        
        Reporter.log("The website used was toolsqa for this test", true);
        String expectedTitle = "Tools QA";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");

	     
  }
}
