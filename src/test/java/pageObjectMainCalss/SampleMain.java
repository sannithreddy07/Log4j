package pageObjectMainCalss;

import java.time.Duration;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import pageObjectModel1.LoginPaged;



public class SampleMain {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void open_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	

	
	@Test
	public void main_method() {
		
		DOMConfigurator.configure("D:\\Programs\\log4j\\src\\test\\resources\\log4j.xml");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		LoginPaged lp=new LoginPaged(driver);
		
	lp.enter_uname_pass("Admin", "admin123");
		lp.click_button();
		lp.verifu_homepage();
		lp.logout_button();
	
		
	}


}
