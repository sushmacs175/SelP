package def;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountProd {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement search= driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("iphone");
		Thread.sleep(2000);
		
		WebElement searchButton= driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		//count of iphone 
		List<WebElement> ele = driver.findElements(By.className("_13oc-S"));
		int count=ele.size();
		System.out.println(count);
		
		//to get names of iphones
		 List<WebElement> productName=driver.findElements(By.className("_4rR01T"));
		    
		    for(WebElement products:productName)
		    {
		    	String name=products.getText();
		    	System.out.println(name);
		    }
		 driver.close();
	
	}
}