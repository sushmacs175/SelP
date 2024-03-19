package SelP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCExample2 {
	
	public static void main(String[] args) throws SQLException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/v1/");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		
		//step2
		Statement stmt=con.createStatement();
		//Step 3
		//execute sql statement
		String s="select username,password from swaglab";
		
		ResultSet rs=stmt.executeQuery(s); 
		
		while(rs.next())
		{
			String username=rs.getString("username");
			
			String password=rs.getString("password");
			
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();
			
			if(driver.getTitle().equals("Swag Labs"))
			{
				System.out.println("Testcase passed");
			}
			else
			{
				System.out.println("Testcase failed");
			}
//			System.out.print(id+ " ");
//			System.out.println(name);
			driver.close();
		}
		
		//step4
		
		con.close();
		
		System.out.println("program is exited");
		
	
	}	
	}

