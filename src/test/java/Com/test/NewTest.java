package Com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.login.Login;
import com.login.RegPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
	RegPage rp;
	
	@BeforeTest
	
	public void initBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		}
	
	@BeforeClass
	public void  initObject() {
		rp= new RegPage(driver);
		
	}

	
  @Test
  public void Login() {
	  rp.login("pooja.meshram639@gmail.com", "Pooja@6797");
	  
	  System.out.println(driver.getTitle());
	  
	  Assert.assertEquals(driver.getTitle(), "Facbook-log in or sign up");
  }
}
