package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("menu-item-20")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
