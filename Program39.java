import java.util.Scanner;

public class Program39 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size:");
		n=s.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the search element:");
		int searchele=s.nextInt();
		int temp=-1;
		for(i=0;i<n;i++) {
			if(searchele==arr[i]) {
				temp=i;
				
			}
		}
		if(temp==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at position:"+temp);
		}
		s.close();
	

	}
	
}
