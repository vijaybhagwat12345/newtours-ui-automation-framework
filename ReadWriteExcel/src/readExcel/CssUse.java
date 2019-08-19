package readExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver;
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(10000);
		WebElement framename = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(framename);
		driver.findElement(By.cssSelector("input#datepicker")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'7')]")).click();
		
		
		
	//	driver.findElement(By.cssSelector("input#datepicker")).sendKeys("08/18/2019");
		//driver.findElement(By.cssSelector("input#datepicker")).sendKeys(Keys.ENTER);
		
		
		
	}

}
