import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertNStudents {
	private static String INSERT_INTO_QUERY="INSERT INTO student VALUES( ?, ?, ?, ?)";
	//Standard
	public static void main(String[] args) {
		//SQL Statement INSERT INTO student VALUES( ?, ?, ?, ?);
		String query = "INSERT INTO student VALUES( ?, ?, ?, ?)";//Should use private final
		int numEntrys = 0;
		int count =0;
		Connection con = null;
		PreparedStatement prst = null;
		
		Scanner sc = new Scanner(System.in);
		String name = null, addrs = null;
		int sno = 0;
		float avg = 0.0f;
		System.out.println("Enter the number of Students::");
		numEntrys=sc.nextInt();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null) {
				//prst=con.prepareStatement(query);
				prst=con.prepareStatement(INSERT_INTO_QUERY);
			}
			if(sc!=null) {
				while(numEntrys>0) {
					System.out.println("Enter student no::");
					sno = sc.nextInt();
					System.out.println("enter name::");
					name = sc.next();
					System.out.println("Enter address");
					addrs = sc.next();
					System.out.println("Enter average");
					avg=sc.nextFloat();
					
					try {
					if(prst!=null) {
						prst.setInt(1, sno);
						prst.setString(2, name);
						prst.setString(3, addrs);
						prst.setFloat(4, avg);
						prst.execute();
						count++;
						int result = prst.getUpdateCount();
						if(result == 0)
							System.out.println("Not added");
						else
							System.out.println("Added "+count+" students");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					numEntrys--;
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(prst!=null)
					prst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				sc.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
					
		}
		
	}
	
}
