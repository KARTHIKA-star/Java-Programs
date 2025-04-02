import java.util.Scanner;

class Student{
	String rollno,name;
	int tot,avg;
	int m1,m2,m3;
	void getdata(Scanner s) {
		System.out.println("Enter the student rollno:");
		rollno=s.next();
		System.out.println("Enter the student name:");
		name=s.next();
		System.out.println("Enter the marks:");
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();			
		}
	void cal()
	{
		tot=m1+m2+m3;
		avg=tot/3;
	}
	void put() {
		System.out.println("The total marks is:"+tot);
		System.out.println("The average is:"+avg);
		
	}
}
public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		st.getdata(s);
		st.cal();
		st.put();
	}

}
