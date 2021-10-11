package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FBsignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/WebProject/chromedriver");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement CreateAccount = driver.findElement(By.xpath("//a[text()= 'Create New Account']"));
		CreateAccount.click();
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select ddDay = new Select(Day);
		
		ddDay.deselectByVisibleText("14");
		
		
		

	}

}
