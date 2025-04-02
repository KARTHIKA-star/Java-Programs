import java.util.Scanner;

public class Program38 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the single line:");
		String s1=s.next();
		String s2=s.nextLine();
		System.out.println("Enter the string:");
		s2=s.nextLine();
		System.out.println("The string1 is:"+s1);
		System.out.println("THe string2 is:"+s2);
		System.out.println("The Concatenation String is:");
		System.out.println(s1+" "+s2);
		System.out.println("The length of string is:");
		System.out.println(s1.length()+" "+s2.length());
		System.out.println("Fetch particular character:");
		System.out.println(s1.charAt(0));
		System.out.println("Fetch the particular substring:");
		System.out.println(s1.substring(2,4));
	}

}
