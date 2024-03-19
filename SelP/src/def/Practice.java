package def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.google.com/");

		    try {
		        //Steps in your test
		    	driver.close();
		    }
		    finally {
		        System.out.println("i am printing anyway");
		    }
		}

	}

