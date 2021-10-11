package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class FbloginTest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		
		UserName.sendKeys("abc@xyz");
		
		WebElement Password = driver.findElement(By.xpath("//[@name='pass']"));
		Password.sendKeys("akjkjfd#df");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		LoginButton.click();
		
		WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		Female.click();
		
		if(Female.isSelected()){
			System.out.println("Radio button selected");
		}else{
			System.out.println("Radio button is not selected");
		}
		
	}

}
