package SelP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * create connection
 * create statement 
 * execute statement
 * close connection
 */
public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
		
		//step1
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		
		//step2
		Statement stmt=con.createStatement();
		
		//Step 3
		
		/*String s="create table swaglab(username varchar(20),password varchar(20))"; 
		stmt.executeUpdate(s);*/
		
		String s1="insert into swaglab values('standard_user','secret_sauce')";			
		stmt.execute(s1);
		
		
		/*String s2="update users set name='mer' where id=1";
		stmt.execute(s2);*/
		
		/*String s3="delete from users where name='def'";
		stmt.execute(s3);*/
		
		
	
		//step4
		
		con.close();
		
		System.out.println("program is exited");
		
	
	}

}
