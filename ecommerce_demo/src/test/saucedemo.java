package test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class saucedemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "chomedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4800, TimeUnit.MILLISECONDS);
		
		//db connection	
		DBConnection conn;
		String Username = "";
		String Password = "";
		
		//Get username and password from database
		conn = new DBConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		Statement stmt = conn.getConnection().createStatement();
		ResultSet rst = stmt.executeQuery("select username,password from login_details");
		rst.next();
		Username = rst.getString("username");
		Password = rst.getString("password");
		
		
		
		
	
		//The login part
		WebElement usern = driver.findElement(By.id("user-name"));
		//user_name.sendKeys("standard_user");
		usern.sendKeys(Username);
		
		WebElement pass = driver.findElement(By.id("password"));
		//pass.sendKeys("secret_sauce");
		pass.sendKeys(Password);
		
		driver.findElement(By.name("login-button")).click();
		
		
		
		//new db connection
		DBConnection conn1;
		String Name = "";
		Double Price=0.0;
		
		conn1 = new DBConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		Statement stmt1 = conn1.getConnection().createStatement();
		ResultSet rst1 = stmt1.executeQuery("select * from eproduct");
		rst1.next();
	    Name = rst1.getString("name");
	    Price = rst1.getDouble("price");
	    
	    System.out.println(Name);
	    System.out.println(Price);
	    
	    
	 //select the product
	  	WebElement bag = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='" + Name + "']/following::button[1]"));
	  	bag.click();
		
	  //checkout
	  	WebElement checkout = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	  	checkout.click();
	  	
	  	//check prices are same
	  	WebElement price_cart = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		
		if(price_cart.equals(Price)) {
			System.out.println("Price Changed "+Price);
		}else {
			System.out.println("Price is Same "+Price);
		}
	  	
	  	WebElement checkout1 = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
	  	checkout1.click();
	
		
		WebElement FName = driver.findElement(By.cssSelector("input[id=first-name]"));
		FName.sendKeys("firstname");
		
		WebElement LName = driver.findElement(By.cssSelector("input[id=last-name]"));
		LName.sendKeys("lastname");
		
		WebElement ZipCode = driver.findElement(By.cssSelector("input[id=postal-code]"));
		ZipCode.sendKeys("007007");
		
		WebElement Continue = driver.findElement(By.cssSelector("input[id=continue]"));
		Continue.click();
		
		WebElement Finish = driver.findElement(By.cssSelector("button[id=finish]"));
		Finish.click();
		
		
	  	
	}

}
