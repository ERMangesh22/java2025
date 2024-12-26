package BestBuy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bestBuyTest1 {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 2)
	public void openBrowser() throws InterruptedException {

		driver.get("https://www.bestbuy.com/");
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void signIn() throws InterruptedException {
		driver.findElement(By.xpath(
				"(//img[@src=\"https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg\"]/following::h4[text()='United States'])[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Credit Cards\"]")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[text()=\"Apply Now\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			driver.findElement(By.id("id=\"survey_invite_no\"")).click();
		}
		driver.findElement(By.id("fld-e")).sendKeys("john.lee@getnada.com");
		Thread.sleep(2000);
		driver.findElement(By.id("fld-p1")).sendKeys("test@123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		driver.findElement(By.xpath("//*[text()='Skip for now']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Confirm & Continue']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void emailContentValidation() {
		String expectedemailAddressContent = "At Ci Cards, we are dedicated to protecting your privacy. We want you to feel comfortable about giving us your email address. The following Email Policy was developed to help you understand how we use email and what your choices are. You are providing this information to both Citibank, N.A. and Best Buy. Information is subject to their respective privacy policies. Best Buy’s Privacy Policy may be viewed at: www.BestBuy.com/privacy.";

		String actualEmailContebt = driver.findElement(By.xpath("(//p[@class='citi-text--color-light']/span)[1]"))
				.getText();
		Assert.assertEquals(actualEmailContebt, expectedemailAddressContent);
		

	}
	
	@AfterClass
	public void close() {
		
			driver.quit();
		

	}

}