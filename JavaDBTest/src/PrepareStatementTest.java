import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareStatementTest {

	public static void main(String[] args) {
		Scanner sc = null;
		Connection con = null;
		Statement st = null;
		PreparedStatement pst = null;
		String q1 = null, q2=null;
		ResultSet rs = null;
		String name = null, newName=null;
		q1 = "SELECT * FROM student";
		q2 = "UPDATE student SET sname = ? WHERE sname = ?";
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter name to update::");
			name = sc.nextLine();
			System.out.println("Enter a new name::");
			newName = sc.nextLine();
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null) {
				st=con.createStatement();
				pst = con.prepareStatement(q2);
			}
			if(pst!=null) {
				pst.setString(1, newName);
				pst.setString(2, name);
			}
			int count = pst.executeUpdate();
			System.out.println(count+" updated");
			rs = st.executeQuery(q1);
			if(rs != null) {
				ResultSetMetaData rsmd = rs.getMetaData();
				int cols = rsmd.getColumnCount();
				boolean flag = false;
				while(rs.next()) {
					flag = true;
					for(int i = 1; i <= cols;i++) {
						if(i>1)
							System.out.print(", ");
						System.out.print(rs.getString(i));
					}
					System.out.println();
				}
				System.out.println(!flag?"Records not found":"Students displayed");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(st!=null)
				st.close();
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
		}
	}

}
