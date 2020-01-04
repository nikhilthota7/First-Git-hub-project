import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		
	}
}
