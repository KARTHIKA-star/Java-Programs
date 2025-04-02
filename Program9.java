import java.util.*;
class studentdetails{
	int rno;
	void get(Scanner sc) {
		System.out.println("Enter the roll no:");
		rno=sc.nextInt();
	}
}
class internal extends studentdetails{
	int m1,m2;
	void collect(Scanner sc) {
		get(sc);
		System.out.println("Enter the internal marks:");
		m1=sc.nextInt();		
		m2=sc.nextInt();		
	}
	int cal() {
		int tot=m1+m2;
		return tot;
	}
}
class external extends internal{
	int sem;
	void add(Scanner sc) {
		collect(sc);
		System.out.println("Enter the semester mark:");
		sem=sc.nextInt();			
	}
	void calculate() {
		int tot=cal();
		int semtot=tot+sem;
		System.out.println("Your Semester total is:"+semtot);
	}
}

public class Program9 {
	public static void main(String[] args) {
		external e =new external();
		Scanner sc=new Scanner(System.in);
		e.add(sc);
		e.calculate();
	    sc.close();
	    
	}
}
