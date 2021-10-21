import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginApp1 {

	public static void main(String[] args) {
		
		Scanner sc = null;
		String user=null,pass=null,query=null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter User Name::");
			user=sc.nextLine();
			System.out.println("Enter Password::");
			pass=sc.nextLine();
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null)
				st=con.createStatement();
			user = "'"+user+"'";
			pass = "'"+pass+"'";
			query = "SELECT count(*) FROM userInfo WHERE uname = "+user+" && pwd = "+pass;
			if(st!=null)
				rs=st.executeQuery(query);
			if(rs.next()) {		
				count=rs.getInt("count(*)");
			}
			System.out.println(count!=0?"Record found":"Record not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(rs!=null)
					rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(st!=null)
					st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			sc.close();
		}

	}

}
