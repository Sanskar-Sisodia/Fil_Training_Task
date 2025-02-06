package myjdbc;
import java.util.Scanner;

public class DB_Reg4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DbConn db = new DbConn();
        while (true) {
            System.out.println("\n========= USER MANAGEMENT SYSTEM =========");
            System.out.println("1. Register New User");
            System.out.println("2. Update User Details");
            System.out.println("3. Delete User");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    registerUser(sc, db);
                    break;
                case 2:
                    updateUser(sc, db);
                    break;
                case 3:
                    deleteUser(sc, db);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // ================== REGISTER NEW USER ==================
    public static void registerUser(Scanner sc,DbConn db) {
        try {
            System.out.println("\nEnter the name: ");
            String nm = sc.nextLine();
            
            System.out.println("Enter the Password: ");
            String pass = sc.nextLine();
            
            System.out.println("Enter the Email: ");
            String eml = sc.nextLine();
            
            System.out.println("Enter the Mobile No: ");
            String mob = sc.nextLine();
            String checkQuery = "SELECT email, mobile FROM reg WHERE email = ? OR mobile = ?";         // Check if email or mobile already exists
            db.pstat = db.conn.prepareStatement(checkQuery);
            db.pstat.setString(1, eml);
            db.pstat.setString(2, mob);

            db.rs = db.pstat.executeQuery();
            boolean emailExists = false, mobileExists = false;
            while (db.rs.next()) {
                if (db.rs.getString("email").equals(eml)) emailExists = true;
                if (db.rs.getString("mobile").equals(mob)) mobileExists = true;
            }

            if (emailExists && mobileExists) {
                System.out.println("Email and Mobile No already exist!");
                return;
            } else if (emailExists) {
                System.out.println("Email already exists!");
                return;
            } else if (mobileExists) {
                System.out.println("Mobile No already exists!");
                return;
            }

            // Generate Unique e_id
            db.rs=db.stat.executeQuery("Select e_id from reg order by e_id desc");
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
				if(n>=0 && n<10)
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
				else if(n>=1000 && n<10000)
				{
					e_id="E"+n;
				}
			}
            // Insert new user
            String insertQuery = "INSERT INTO reg VALUES (?, ?, ?, ?, ?)";
            db.pstat = db.conn.prepareStatement(insertQuery);
            db.pstat.setString(1, e_id);
            db.pstat.setString(2, nm);
            db.pstat.setString(3, pass);
            db.pstat.setString(4, eml);
            db.pstat.setString(5, mob);
            db.pstat.executeUpdate();
            System.out.println("Congratulations!");
        } catch(Exception e)
		{
			System.err.println(e);
		}
    }

    // ================== UPDATE USER DETAILS ==================
    public static void updateUser(Scanner sc,DbConn db) {
        try {
            System.out.println("\nEnter the E_ID to update: ");
            String e_id = sc.nextLine();

            //System.out.println("Enter new Name: ");
            //String newName = sc.nextLine();

            System.out.println("Enter new Password: ");
            String newPassword = sc.nextLine();

            System.out.println("Enter new Email: ");
            String newEmail = sc.nextLine();

            System.out.println("Enter new Mobile No: ");
            String newMobile = sc.nextLine();

            // Update user details
            String updateQuery = "UPDATE reg SET password = ?, email = ?, mobile = ? WHERE e_id = ?";
            db.pstat = db.conn.prepareStatement(updateQuery);
            //db.pstat.setString(1, newName);
            db.pstat.setString(2, newPassword);
            db.pstat.setString(3, newEmail);
            db.pstat.setString(4, newMobile);
            db.pstat.setString(5, e_id);

            int rowsUpdated = db.pstat.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("User details updated successfully!");
            } else {
                System.out.println("E_ID not found! Update failed.");
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // ================== DELETE USER ==================
    public static void deleteUser(Scanner sc, DbConn db) {
        try {
            System.out.println("\nEnter the E_ID to delete: ");
            String e_id = sc.nextLine();

            // Delete user
            String deleteQuery = "DELETE FROM reg WHERE e_id = ?";
            db.pstat = db.conn.prepareStatement(deleteQuery);
            db.pstat.setString(1, e_id);

            int rowsDeleted = db.pstat.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("User deleted successfully!");
            } else {
                System.out.println("E_ID not found! Deletion failed.");
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}