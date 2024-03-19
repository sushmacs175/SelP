package def;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountFrames {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		List<WebElement> iframes=driver.findElements(By.xpath("//iframe"));
		
		System.out.println(iframes.size());
		
		 // you can reach each frame on your site
        for (WebElement iframe : iframes) {

            // switch to every frame
            driver.switchTo().frame(iframe);

            // now within the frame you can navigate like you are used to
            System.out.println(driver.findElement(By.id("tinymce")).getText());
        }

	}

}
