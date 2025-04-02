import java.util.Scanner;

class google{
	String name,pho,email;
	void get(Scanner s) {
		System.out.println("Enter the name:");
		name=s.next();
		System.out.println("Enter the phoneno:");
		pho=s.next();
		System.out.println("Enter the email:");
		email=s.next();
	}
	void put() {
		System.out.println("The name is:"+name+"phone no is:"+pho+"also a email is:"+email);
	}
}
class facebook extends google{
	String username,password;
	void getdata(Scanner s)
	{
		System.out.println("Enter the username:");
		username=s.next();
		System.out.println("Enter the password:");
		password=s.next();	
	}
	void putdata()
	{
		System.out.println("The name is:"+username+"phone no is:"+password);
	}
}
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		facebook f=new facebook();
		f.get(s);
		f.put();
		f.getdata(s);
		f.putdata();
	}

}
