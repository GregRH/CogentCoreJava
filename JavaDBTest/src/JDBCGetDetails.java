import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCGetDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con  = null;
		Statement st = null;
		ResultSet rt = null;
		String query = null;
		Scanner sc = null;
		int start = 160, stop = 999;
		try {
			sc= new Scanner(System.in);
			 System.out.println("Enter Start value::");
			 start = sc.nextInt();
			 System.out.println("Enter end value::");
			 stop=sc.nextInt();
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null)
				st = con.createStatement();
			query = "SELECT * FROM STUDENT WHERE sno>="+start+" && "+"sno<="+stop;
			if(st!=null)
				rt = st.executeQuery(query);
			if(rt != null) {
				ResultSetMetaData rsmd = rt.getMetaData();
				int cols = rsmd.getColumnCount();
				boolean flag = false;
				while(rt.next()) {
					flag = true;
					for(int i = 1; i <= cols;i++) {
						if(i>1)
							System.out.print(", ");
						System.out.print(rt.getString(i));
					}
					System.out.println();
				}
				System.out.println(!flag?"Records not found":"Students whos sno >="+start+" and <="+stop+ " are displayed");
			}
			System.out.println(".............................................");
			System.out.println("con object class name::"+ con.getClass());
			System.out.println("st object class name::"+ st.getClass());
			System.out.println("rs object class name::"+ rt.getClass());
			rt.close();
			st.close();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
