package myjdbc;
import java.util.*;


public class DB_Reg1 {
	public static void main(String []ar)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String nm=sn.nextLine();
		System.out.println("Enter the password : ");
		String pass=sn.nextLine();
		System.out.println("Enter the salary : ");
		double sal=sn.nextDouble();
		DbConn db= new DbConn();
		try
		{
			String qry="insert into table1 values('" + nm + "','" + pass + "'," + sal + ")";
			System.out.println(qry);
			db.stat.executeUpdate(qry);
			System.out.println("Congrats!");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
		
	}
	
}
