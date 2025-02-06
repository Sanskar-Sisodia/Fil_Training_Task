package myjdbc;
import java.util.*;

public class report1 {
	public static void main(String[] ar)
	{
		DbConn3 db=new DbConn3();
		try {
			db.rs=db.stat.executeQuery("Select * from table1");
			db.md=db.rs.getMetaData();
			int c=db.md.getColumnCount();
			for(int i=1;i<=c;i++)
			{
				System.out.print("\t"+db.md.getColumnLabel(i));
			}
			System.out.println("\n---------------------------------------------------------");
			int n=0;
			while(db.rs.next())
			{
				n++;
				for(int i=1;i<=c;i++)
				{
					System.out.print("\t"+db.rs.getString(i));
				}
				System.out.println("\n\t" + n + "record(s)");
			}
			
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
	

}
