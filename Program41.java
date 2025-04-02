import java.util.Scanner;

public class Program41 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s1=new String[n];
		for(int i=0;i<n;i++) {
			s1[i]=sc.next();
		}
		int q=sc.nextInt();
		String[] q1=new String[q];
		for(int i=0;i<q;i++) {
			q1[i]=sc.next();
		}
		int op[]=new int[q1.length];
		for(int i=0;i<q1.length;i++) {
			int count=0;
			for(int j=0;j<s1.length;j++) {
				if(q1[i].equals(s1[j])) {
					count++;
				}
			}
			op[i]=count;
		}
		for(int i=0;i<op.length;i++) {
			System.out.println(op[i]);
		}
		
		

	}

}
