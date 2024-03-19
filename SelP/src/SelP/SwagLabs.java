package SelP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement userName=driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton= driver.findElement(By.id("login-button"));
		loginButton.submit();

		Thread.sleep(2000);
		
		WebElement addButton= driver.findElement(By.xpath("(//button[text()=\"ADD TO CART\"])[1]"));
		addButton.click();
		Thread.sleep(2000);
		WebElement cart= driver.findElement(By.className("shopping_cart_container"));
		cart.click();
		Thread.sleep(2000);
		
		WebElement checkoutOption= driver.findElement(By.xpath("//a[text()=\"CHECKOUT\"]"));
		checkoutOption.click();
		Thread.sleep(2000);
		
		WebElement firstName= driver.findElement(By.id("first-name"));
		firstName.sendKeys("sushma");
		Thread.sleep(1000);
		
		WebElement lastName= driver.findElement(By.id("last-name"));
		lastName.sendKeys("cs");
		Thread.sleep(1000);
		
		WebElement postalCode= driver.findElement(By.id("postal-code"));
		postalCode.sendKeys("560078");
		Thread.sleep(2000);
		WebElement continueButton=driver.findElement(By.xpath("//input[@value=\"CONTINUE\"]"));
		continueButton.submit();
		Thread.sleep(2000);
		
		
		WebElement finishOption=driver.findElement(By.xpath("//a[text()=\"FINISH\"]"));
		finishOption.click();
		
		
		
	}

}
