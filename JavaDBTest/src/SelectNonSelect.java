import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectNonSelect {

	public static void main(String[] args) {
		Scanner sc = null;
		Connection con = null;
		Statement st=null;
		ResultSet rs = null;
		String query1=null;//,query2=null;
		int count = 0;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter a select or non select query::");
			query1 = sc.nextLine();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null) 
				st = con.createStatement();
//			query1="SELECT * FROM student WHERE avg < 10";
//			query2="UPDATE student SET sname = 'Fred' WHERE sname != 'Fred'";
			if(st != null) {
				//st.execute(query2);
				boolean rsflag = st.execute(query1);
				if(rsflag) {
					rs = st.getResultSet();
					System.out.println("Select query");
					boolean flag = false;
					if (rs != null) {
						int cols = rs.getMetaData().getColumnCount();
						while (rs.next()) {
							flag = true;
							for (int i = 1; i <= cols; i++) {
								if (i > 1)
									System.out.print(", ");
								System.out.print(rs.getString(i));
							}
							System.out.println();
						}
						System.out.println(!flag ? "Records not found" : "Displayed found students");
					}
				}else {
					System.out.println("Non select query");
					count = st.getUpdateCount();
					System.out.println("Updated "+count);
				}
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
