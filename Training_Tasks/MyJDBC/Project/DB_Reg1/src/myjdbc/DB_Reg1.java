package myjdbc;
import java.util.*;
public class DB_Reg1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sn.nextLine();
        System.out.println("Enter password: ");
        String password = sn.nextLine();
        System.out.println("Enter salary: ");
        double salary = sn.nextDouble();
        DbConn db = new DbConn();
        try{
            //String qry = "insert into table1 values(' " + name + " ', ' " + password + " ', " + salary + ")";
            //System.out.println(qry);
        	String qry="insert into table1 values(?,?,?)";
        	db.pstat=db.conn.prepareStatement(qry);
        	db.pstat.setString (1,name);
        	db.pstat.setString(2,password);
        	db.pstat.setDouble(3,salary);


        	
            db.pstat.executeUpdate();
            System.out.println("Congrats!!");
        }
        catch(Exception e){
            System.err.println(e);
        }

    }
}