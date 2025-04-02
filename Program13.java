import java.util.Scanner;

class employee{
	String empid,empname;
	void get(Scanner s) {
		System.out.println("Enter the details:");
		empid=s.next();
		empname=s.next();
	}
	public employee() {
		super();
		System.out.println("This is a default constructor");
	}
	public employee(String empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
}
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		employee e=new employee();
		e.get(s);
		System.out.println(e);
		
	}

}
