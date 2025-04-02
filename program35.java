import java.util.Scanner;

public class program35 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i,n,prod=1;
		System.out.println("Enter the size:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt(); int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
			prod=prod*arr[i];
		}
		for(i=0;i<n;i++) {
			System.out.println((prod/arr[i])+" ");
		}
		s.close();
		}
		}


