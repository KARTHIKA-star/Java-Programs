import java.util.Arrays;
import java.util.Scanner;

public class Program32 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the array size:");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("The array elements are:");
		System.out.println(Arrays.toString(arr));
		s.close();

	}

}
