//using pstat is a better method to insert
package myjdbc;
import java.util.*;

public class DB_Reg2 {

	public static void main(String []ar)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String nm=sn.nextLine();
		System.out.println("Enter the password : ");
		String pass=sn.nextLine();
		System.out.println("Enter the salary : ");
		double sal=sn.nextDouble();
		DbConn2 db= new DbConn2();
		try
		{
			//String qry="insert into table1 values('" + nm + "','" + pass + "'," + sal + ")";
			String qry="insert into table1 values(?,?,?)";
			db.pstat=db.conn.prepareStatement(qry);
			db.pstat.setString(1,  nm);
			db.pstat.setString(2,  pass);
			db.pstat.setDouble(3,  sal);
			db.pstat.executeUpdate();
			System.out.println("Congrats!");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
	}
	
}

