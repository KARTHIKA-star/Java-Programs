import java.util.Scanner;
class emp{
	int empno;
	String empname;
	void get(Scanner s) {
		System.out.println("Enter the details:");
		empno=s.nextInt();
		empname=s.next();
	}
	public emp() {
		System.out.println("Your name is:"+empname);
		System.out.println("Your no is:"+empno);
	}
	
	}

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		emp e=new emp();
		e.get(s);
		
	
	

	}

}
