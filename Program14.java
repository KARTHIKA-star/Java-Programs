import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		a=s.nextInt();
		b=s.nextInt();
		if(a>b) {
			System.out.println("The big no is:"+a);
		}
		else
		{
			System.out.println("The big no is:"+b);
		}
		s.close();
		

	}

}
