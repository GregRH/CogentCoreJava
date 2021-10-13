import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DoubleStatement {

	public static void main(String[] args) {
		Connection con = null;
		Statement st=null;
		ResultSet rs = null;
		String query1=null,query2=null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null) 
				st = con.createStatement();
			query1="SELECT * FROM student";
			query2="UPDATE student SET sname = 'Fred' WHERE sname != 'Fred'";
			if(st != null) {
//				rs = st.executeQuery(query1);
//				st.executeUpdate(query2);
				st.execute(query2);
				st.execute(query1);
				rs = st.getResultSet();
			}
			boolean flag = false;
			if(rs!=null) {
			int cols = rs.getMetaData().getColumnCount();
			while(rs.next()) {
				flag = true;
				for(int i = 1; i <= cols;i++) {
					if(i>1)
						System.out.print(", ");
					System.out.print(rs.getString(i));
				}
				System.out.println();
			}
			System.out.println(!flag?"Records not found":"Students");
			rs.close();}
			st.close();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
