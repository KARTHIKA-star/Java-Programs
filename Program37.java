import java.util.Scanner;

public class Program37 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,p=1;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		n=Sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++) {
			a[i]=Sc.nextInt();
			p=p*a[i];
		}
		for(i=0;i<n;i++) {
			System.out.print(p/a[i]+" ");
			
		}
		
		
	}

}
