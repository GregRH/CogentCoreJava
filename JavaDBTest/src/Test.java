import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sn = null;
		int sno =0;
		float avg = 0.0f;
		Connection con =null;
		String name=null,addrs=null;
		String query= null;
		Statement st =null;
		int count = 0;
		
		try {
			sn=new Scanner(System.in);
			if(sn!=null) {
				System.out.println("Enter Student number::");
				sno = sn.nextInt();
				System.out.println("Enter Student Name::");
				name=sn.next();
				System.out.println("Enter Student Address::");
				addrs=sn.next();
				System.out.println("Enter Student Average::");
				avg= sn.nextFloat();
			}
			name = "'"+name+"'";
			addrs = "'"+addrs+"'";
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud" ,"root","#gRh1234567890");
			if(con!=null) 
				st=con.createStatement();
			query="INSERT INTO STUDENT VALUES("+sno+","+name+","+addrs+","+avg+")";
			//System.out.println(con.getClass().getName());
			System.out.println(query);
			if(st!=null)
				count = st.executeUpdate(query);
			if(count==0)
				System.out.println("Record not inserted");
			else
				System.out.println("Record inserted::"+count);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
