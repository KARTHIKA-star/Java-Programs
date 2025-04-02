import java.util.Scanner;

class insta{
	String name,password;
	void get(Scanner s) {
		System.out.println("Enter the details:");
		name=s.next();
		password=s.next();
	}
	public insta(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

}
class Ff extends insta{
	int ffid;
	void gets(Scanner s) {
		System.out.println("Enter the id:");
		ffid=s.nextInt();
	}

	public Ff(String name, String password, int ffid) {
		super(name, password);
		this.ffid = ffid;
	}

	@Override
	public String toString() {
		return "Ff [ffid=" + ffid + ", name=" + name + ", password=" + password + "]";
	}
}
public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Ff f= new Ff(null, null, 0);
		f.get(s);
		f.gets(s);
		System.out.println(f);

	}

}
