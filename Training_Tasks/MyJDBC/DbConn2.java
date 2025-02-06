package myjdbc;
import java.sql.*;

public class DbConn2 {

	public Connection conn;
	public Statement stat;
	public PreparedStatement pstat;
	public DbConn2()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2", "root", "root");
			stat=conn.createStatement();		}
		catch(Exception e){
			System.err.println(e);
			
		}
	}

}
