package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.gecko.driver", "geckodriver");
//		
//		WebDriver driver1 = new FirefoxDriver();
//		
//		driver1.get("https://github.com");
		
		
		System.setProperty("webdriver.chromedriver", "chomedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4800, TimeUnit.MILLISECONDS);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		//WebDriverWait wait = new WebDriverWait(driver)
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("afad@gmail.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("A1213$dsf");
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		String ActualMsg = Error.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		if(ActualMsg.equals(ExpMsg)) {
			System.out.println("Test Passed");
			
		}else {
			System.out.println("Test Failed");
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are :"   + Links.size());
		
		for(WebElement data : Links) {
            System.out.println("output : "+ data.getText());
        }
//		
//		WebElement ForgotPass = driver.findElement(By.partialLinkText("Forgot"));
//		ForgotPass.click();
//		
//		Thread.sleep(5000);
//		
//		
		driver.quit();
		
		

	}

}
