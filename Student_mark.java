import java.util.*;
class mark
{
	String name,rollno,dep;
	int mark1,mark2,mark3,best1,best2;
	float sem,total,gd;
	void collect()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name:");
		name=sc.nextLine();
		System.out.println("Enter the Rollno:");
		rollno=sc.nextLine();
		System.out.println("Enter the Department:");
		dep=sc.nextLine();
		System.out.println("Enter the Internal 1:");
		mark1=sc.nextInt();
		System.out.println("Enter the Internal 2:");
		mark2=sc.nextInt();
		System.out.println("Enter the Internal 3:");
		mark3=sc.nextInt();	
	}
	void cal()
	{
		Scanner st=new Scanner(System.in);
		if(mark1<=mark2&&mark1<=mark3) {
			best1=mark2;
			best2=mark3;
		}
		else if(mark2<=mark1&&mark2<=mark3)
		{
			best1=mark1;
			best2=mark3;
		}
		else {
			best1=mark1;
			best2=mark2;
		}
		total=(best1+best2)/2;	
		System.out.println("Enter the semester mark:");
		sem=st.nextInt();
		gd=sem+total;
		System.out.println("Student total mark is:"+total);
		System.out.println("The Grand total is:"+gd);
		
		
	}
	void display()
	{
			System.out.println(name+"\t"+rollno+"\t\t"+dep+"\t\t"+mark1+"\t\t"+mark2+"\t\t"+mark3+"\t"+total+"\t"+sem+"\t"+gd);	
	}
	
	
}
public class Student_mark {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of students:");
		n=sc.nextInt();
		mark[] m = new mark[n];
		for(int i=0;i<n;i++) {
			m[i] = new mark();
			m[i].collect();
			m[i].cal();
		}
		 System.out.println("\n****************** STUDENT DETAILS ******************");
	        System.out.println("____________________________________________________________________________________________________");
	        System.out.println("Name\tRoll No \tDepartment\tInt1\tInt2\tInt3\tTotal\tSemester\tGrand Total");
	        System.out.println("____________________________________________________________________________________________________");
		for(int i=0;i<n;i++) {
			m[i].display();
		}
		System.out.println("________________________________________________________________________________________________________");
		
	}

}
