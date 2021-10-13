import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCUpdateTest {

	public static void main(String[] args) {
		
		Scanner sc = null;
		int sNum = 0;
		String name = null;
		String addrs = null;
		float avg = 0.0f;
		Connection con = null;
		Statement st = null;
		String query = null;
		int count = 0;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter Student Number to be updated");
			sNum = sc.nextInt();
			System.out.println("Enter New Name::");
			name=sc.next();
			System.out.println("Enter New Address::");
			addrs=sc.next();
			System.out.println("Enter new avg::");
			avg=sc.nextFloat();
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null)
				st=con.createStatement();
			//UPDATE student SET sname = new, sadd = new, avg = new WHERE sno = Snum
			addrs="'"+addrs+"'";
			name="'"+name+"'";
			query = "UPDATE student SET sname = "+name+", sadd = "+addrs+", avg = "+avg+" WHERE sno = "+sNum;
			System.out.println(query);
			if(st!=null)
				count = st.executeUpdate(query);
			System.out.println(count>0?"Updated "+count:"Not found");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
