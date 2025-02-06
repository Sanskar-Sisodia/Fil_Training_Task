package myjdbc;
import java.util.*;

public class Db_Reg3{
	public static void main(String []ar)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String nm=sn.nextLine();
		System.out.println("Enter the pass: ");
		String pass=sn.nextLine();
		System.out.println("Enter the sal: ");
		Double sal=sn.nextDouble();
		DbConn db=new DbConn();
		
		try {
			db.rs=db.stat.executeQuery("select e_id from table2 order by e_id desc");
			String e_id="";
			if(!db.rs.next())
			{
				e_id="E0001";
			}
			else
			{
				e_id=db.rs.getString("e_id");
				e_id=e_id.substring(1);
				int n=Integer.parseInt(e_id);
				n++;
				if(n>=10 && n<100)
				{
					e_id="E000"+n;
				}
				else if(n>=10 && n<100)
				{
					e_id="E00"+n;
				}
				else if(n>=100 && n<1000)
				{
					e_id="E0"+n;
				}
				else if(n>=1000 && n<1000)
				{
					e_id="E"+n;
				}
				
				String qry="insert into table2 values(?,?,?,?)";
				db.pstat=db.conn.prepareStatement(qry);
				db.pstat.setString(1,  e_id);
				db.pstat.setString(2, nm);
				db.pstat.setString(3,  pass);
				db.pstat.setDouble(4,  sal);
				db.pstat.executeUpdate();
				System.out.println("Congrats!");
				System.out.println("Remember your ID: "+e_id);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}


