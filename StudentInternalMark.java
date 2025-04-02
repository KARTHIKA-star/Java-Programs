import java.util.Scanner;
import java.sql.*;
public class StudentInternalMark {

	public static void main(String[] args)throws SQLException, ClassNotFoundException  {
		int ch;
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		while (true) {  
            System.out.println("\n******** MENU ********");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Details");
            System.out.println("3. Add Internal Details");
            System.out.println("4. Add External Details");
            System.out.println("5. View Report");
            System.out.println("6. Search a particular student record");
            System.out.println("7. Exit");
            System.out.print("Enter your choice:");
            ch = sc.nextInt();
            sc.nextLine();
		switch(ch) {
		case 1:
	
			System.out.println("***** Add Student Details ******");
			System.out.println("Enter the student name:");
			String tname=sc.nextLine();
			System.out.println("Enter the student roll no:");
			String roll=sc.nextLine();
			System.out.println("Enter the student department:");
			String tdep=sc.nextLine();
	
			String sql="INSERT INTO `stud_det`(`roll_no`, `stud_name`, `department`) VALUES (?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,roll);
			ps.setString(2, tname);
			ps.setString(3,tdep);
		
			int op=ps.executeUpdate();
			if(op==1) {
				System.out.println("Inserted Successfully");
			}
			else {
				System.out.println("");
			}
			break;	
		case 2:
		{
			System.out.println("The Student records are:");
			Statement st=con.createStatement();
			String sql1="select * from stud_det";
			ResultSet rs=st.executeQuery(sql1);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+rs.getString(3)+"\t"+rs.getString(4));
			}
			break;
			}
		case 3:
		{
			int int1,int2,int3,best1,best2;
			System.out.println("***** Add Internal Marks *****");
			System.out.println("Enter the student roll:");
			String roll1=sc.nextLine();
			System.out.println("Enter the internal marks:");
			int1=sc.nextInt();
			int2=sc.nextInt();
			int3=sc.nextInt();
			if(int1<=int2&&int1<=int3) {
				best1=int2;
				best2=int3;
			}
			else if(int2<=int1&&int2<=int3)
			{
				best1=int1;
				best2=int3;
			}
			else {
				best1=int1;
				best2=int2;
			}
			int total=(best1+best2)/2;	
			System.out.println("The Internal Mark for:"+total);
			String sql1="INSERT INTO `internal_mark`(`stud_roll`, `mark1`, `mark2`, `mark3`, `total`) VALUES (?,?,?,?,?)";
			PreparedStatement ps1=con.prepareStatement(sql1);
			ps1.setString(1, roll1);
			ps1.setInt(2,int1);
			ps1.setInt(3,int2);
			ps1.setInt(4,int3);
			ps1.setInt(5,total);
		
			int op1=ps1.executeUpdate();
			if(op1==1) {
				System.out.println("Inserted Successfully");
			}
			else {
				System.out.println("");
			}
			break;			
		}
		case 4:
		
		    System.out.println("***** Add External Marks *****");
		    System.out.println("Enter the student roll no:");
		    String roll2 = sc.nextLine();
		    String fetchTotalQuery = "SELECT total FROM internal_mark WHERE stud_roll = ?";
		    PreparedStatement fetchTotalStmt = con.prepareStatement(fetchTotalQuery);
		    fetchTotalStmt.setString(1, roll2);
		    ResultSet rsTotal = fetchTotalStmt.executeQuery();
		    
		    int internalTotal = 0;
		    if (rsTotal.next()) {
		        internalTotal = rsTotal.getInt("total");
		    } else {
		        System.out.println("No internal marks found for this student!");
		        break;  
		    }
		    System.out.println("Enter the external mark:");
		    int extMark = sc.nextInt();
		    int finalSemesterTotal = internalTotal + extMark;
		    String insertExtQuery = "INSERT INTO external_mark (stud_roll, ext_mark, final_total) VALUES (?,?,?)";
		    PreparedStatement insertExtStmt = con.prepareStatement(insertExtQuery);
		    insertExtStmt.setString(1, roll2);
		    insertExtStmt.setInt(2, extMark);
		    insertExtStmt.setInt(3, finalSemesterTotal);
		    int extInsertStatus = insertExtStmt.executeUpdate();
		    if (extInsertStatus == 1) {
		        System.out.println("External Marks Inserted Successfully!");
		        System.out.println("Internal Total: " + internalTotal);
		        System.out.println("External Marks: " + extMark);
		        System.out.println("Final Semester Total: " + finalSemesterTotal);
		    } else {
		        System.out.println("Error inserting external marks!");
		    }
		    break;
		case 5:
		    System.out.println("***** View Student Report *****");

		    String reportQuery = "SELECT s.roll_no, s.stud_name, s.department, " +
		                         "COALESCE(i.mark1, 0) AS mark1, COALESCE(i.mark2, 0) AS mark2, COALESCE(i.mark3, 0) AS mark3, " +
		                         "COALESCE(i.total, 0) AS internal_total, " +
		                         "COALESCE(e.ext_mark, 0) AS ext_mark, COALESCE(e.final_total, 0) AS final_total " +
		                         "FROM stud_det s " +
		                         "LEFT JOIN internal_mark i ON s.roll_no = i.stud_roll " +
		                         "LEFT JOIN external_mark e ON s.roll_no = e.stud_roll"; 

		    Statement reportStmt = con.createStatement();
		    ResultSet rsReport = reportStmt.executeQuery(reportQuery);

		    System.out.println("\n----------------------------------------------------------------------------------------");
		    System.out.printf("%-10s %-15s %-15s %-5s %-5s %-5s %-10s %-10s %-10s\n",
		                      "Roll No", "Name", "Department", "M1", "M2", "M3", "Int.Total", "Ext.Mark", "Final.Total");
		    System.out.println("------------------------------------------------------------------------------------------");

		    while (rsReport.next()) {  
		        System.out.printf("%-10s %-15s %-15s %-5d %-5d %-5d %-10d %-10d %-10d\n",
		                          rsReport.getString("roll_no"),
		                          rsReport.getString("stud_name"),
		                          rsReport.getString("department"),
		                          rsReport.getInt("mark1"),
		                          rsReport.getInt("mark2"),
		                          rsReport.getInt("mark3"),
		                          rsReport.getInt("internal_total"),
		                          rsReport.getInt("ext_mark"),
		                          rsReport.getInt("final_total"));
		    }
		    System.out.println("--------------------------------------------------------------------------------------");

		case 6:
		
		    System.out.println("***** Search Student Record *****");
		    System.out.print("Enter Student Roll No: ");
		    String searchId = sc.nextLine();
		    
		   
		    String searchQuery = "SELECT  s.roll_no,s.stud_name, s.department, " +
		                         "IFNULL(i.mark1, 0) AS mark1, IFNULL(i.mark2, 0) AS mark2, IFNULL(i.mark3, 0) AS mark3, " +
		                         "IFNULL(i.total, 0) AS internal_total, " +
		                         "IFNULL(e.ext_mark, 0) AS ext_mark, IFNULL(e.final_total, 0) AS final_total " +
		                         "FROM stud_det s " +
		                         "LEFT JOIN internal_mark i ON s.roll_no = i.stud_roll " +
		                         "LEFT JOIN external_mark e ON s.stud_id =  e.stud_roll " +
		                         "WHERE s.roll_no = ?";

		    PreparedStatement searchStmt = con.prepareStatement(searchQuery);
		    searchStmt.setString(1, searchId);
		    ResultSet rsSearch = searchStmt.executeQuery();

		   
		    if (rsSearch.next()) {
		        System.out.println("\n--------------------------------------------------------------------------------------");
		        System.out.printf(" %-10s %-10s %-12s %-5s %-5s %-5s %-10s %-10s %-10s\n",
		                          "Roll No","Name", "Department", "M1", "M2", "M3", "Int.Total", "Ext.Mark", "Final.Total");
		        System.out.println("----------------------------------------------------------------------------------------");

		        System.out.printf(" %-10s %-10s %-12s %-5d %-5d %-5d %-10d %-10d %-10d\n",
		                       
		                          rsSearch.getString("roll_no"),
		                          rsSearch.getString("stud_name"),
		                          rsSearch.getString("department"),
		                          rsSearch.getInt("mark1"),
		                          rsSearch.getInt("mark2"),
		                          rsSearch.getInt("mark3"),
		                          rsSearch.getInt("internal_total"),
		                          rsSearch.getInt("ext_mark"),
		                          rsSearch.getInt("final_total"));

		        System.out.println("------------------------------------------------------------------------------------");
		    } else {
		        System.out.println("No record found for Student Roll No: " + searchId);
		    }
		    break;
		case 7:
			System.out.println("Invalid Input");
			con.close();
		    sc.close();
		    System.exit(0);
		    break;
		    }  	
		}
	}

	}

