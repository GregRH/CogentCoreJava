import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		String query = null;
		ResultSet rs = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con != null)
				st = con.createStatement();
			query = "SELECT * FROM emp WHERE job = 'Manager' || job = 'Trainer' || job = 'Secretary'";
			if(st != null)
				rs = st.executeQuery(query);
			if(rs != null) {
				while(rs.next()) {
					int cols = rs.getMetaData().getColumnCount();
					for(int i = 1; i <= cols; i++) {
						if(i>1)
							System.out.print(", ");
						System.out.print(rs.getString(i));
					}
					System.out.println();
				}
			}
			rs.close();
			st.close();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
