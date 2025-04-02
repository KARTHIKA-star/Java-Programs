import java.util.Scanner;

class support{
		static int a,b;
	
		static void put(Scanner s) {
			System.out.println("Enter the two numbers:");		
			a=s.nextInt();
			b=s.nextInt();
		System.out.println("The value is:"+(a+b));		
	}
}
class support1{
	static void get() {
		System.out.println("This is a static method example");
	}
}
public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		support1.get();
		Scanner s=new Scanner(System.in);
		support .put(s);
		
		

	}

}
