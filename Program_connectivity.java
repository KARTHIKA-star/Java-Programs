import java.sql.*;
public class Program_connectivity {
	public static void main(String[] args) throws SQLException {
		//configure driver file
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/aakkamgroups_ebridge","root","");
		    //for invoke queries
			Statement st=con.createStatement();
			String sql="select name from aakkamusers";
			ResultSet rs=st.executeQuery(sql);

			while(rs.next()) {
				System.out.println(rs.getString(1));		
			}		
			
			
		} catch (ClassNotFoundException e) {
		// we cannot import the jar file this block will be give a msg as class not found
			
			e.printStackTrace();
		}
		
		
		
	}

}
