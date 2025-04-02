import java.util.Scanner;
class Support4{
	public int a,b;
	private int tot;
	void get(Scanner s) {
		System.out.println("Enter the values:");
		a=s.nextInt();
		b=s.nextInt();
		get1();
	}
	private void get1() {
		tot=a+b;
		System.out.println("The total value is:"+tot);
		
	}
}
public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Support4 obj=new Support4();
		obj.get(s);
		
	}

}
