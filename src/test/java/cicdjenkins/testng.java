package cicdjenkins;
//import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng {


	
	public static WebDriver driver=null;
	@BeforeClass
	public static void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//Assert.assertEquals(driver.getCurrentUrl(),"http://opensource.demo.orangehrmlive.com/");
	}

	@Test
	
	public static void logintoApplicationWe()
	{
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"http://opensource.demo.orangehrmlive.com/index.php/dashboard");
	}
	
	@AfterTest
	public static void endtest()
	{
		driver.quit();
	}
}



