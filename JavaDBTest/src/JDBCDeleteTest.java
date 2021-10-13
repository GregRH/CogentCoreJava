import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		Connection con = null;
		Statement st = null;
		String query = null;
		String addrs = null;
		int count = 0;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter address to delete");
			addrs = sc.next();
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null)
				st=con.createStatement();
			addrs="'"+addrs+"'";
			query = "DELETE FROM student WHERE sadd = " + addrs;
			if(st!=null)
				count = st.executeUpdate(query);
			System.out.println(count>0?"Deleted "+count:"record not found");
			st.close();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
