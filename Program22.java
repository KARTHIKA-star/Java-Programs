import java.util.Scanner;

class Support3{
	int a,b;
	void get(Scanner s)
	{
		
		System.out.println("Enter the details:");
		a=s.nextInt();
		b=s.nextInt();
	}
	void put() {
		System.out.println("The values of a and b is:"+a+" "+b);
	}
}
public class Program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Support3 obj=new Support3();
		obj.get(s);
		obj.put();
	}

}