import java.sql.*;
import java.util.Scanner;
public class JdbcProgramsample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/todo","root","");
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Insert the table\n2.Fetch the all records\n3.Fetch particular record\n4.Update the record\n5.Delete the record");
		System.out.println("Enter the choice:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			sc.nextLine();
			String tname=sc.nextLine();
			String tdate=sc.nextLine();
			String status=sc.nextLine();
			String sql="INSERT INTO `task`(`taskname`, `taskdate`, `status`) VALUES (?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, tname);
			ps.setString(2,tdate);
			ps.setString(3,status);
			int op=ps.executeUpdate();
			if(op==1) {
				System.out.println("Insered Successfully");
			}
			else {
				System.out.println("");
			}
			break;	
		case 2:
			{
			System.out.println("The records are:");
			Statement st=con.createStatement();
			String sql1="select * from task";
			ResultSet rs=st.executeQuery(sql1);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			break;
			}
		case 3:
		{
			System.out.println("");
			System.out.println("****** Search a particular record ******");
			System.out.println("Enter the id to search:");
			int id1=sc.nextInt();
			String sql2="select * from task where taskid=?";
			PreparedStatement ps1=con.prepareStatement(sql2);
			ps1.setInt(1, id1);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next()) {
				System.out.println(rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4));
			}
			break;
			
		}
		case 4:
		{
			System.out.println("****** Update a particular record ******");
			System.out.println("Enter the id to update:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the taskname,taskdate and status:");
			String tname1=sc.nextLine();
			String tdate1=sc.nextLine();
			String status1=sc.nextLine();
			String sql3="update task set taskname=?,taskdate=?,status=? where taskid=?";
			PreparedStatement ps2=con.prepareStatement(sql3);
			ps2.setString(1, tname1);
			ps2.setString(2, tdate1);
			ps2.setString(3, status1);
			ps2.setInt(4, id);
			int op2=ps2.executeUpdate();
			if(op2==1) {
				System.out.println("Updated succesfully");
			}else {
				System.out.println("Failure");
			}
		}
		case 5:
		{
         System.out.println("Enter a id for delete:");
         int id=sc.nextInt();
         String sql4="delete from task where taskid=?";
         PreparedStatement ps4=con.prepareStatement(sql4);
         ps4.setInt(1, id);
         int op3=ps4.executeUpdate();
         if(op3==1) {
        	 System.out.println("Deleted a record");
             }else {
            	 System.out.println("Something went wrong");
             }
		}
		default:
			System.out.println("Invaild Input");
				
	}
	}
}
