class pd
{
	String name,phono;
	int no;
	public pd(String name, String phono, int no) {
		super();
		this.name = name;
		this.phono = phono;
		this.no = no;
	}
}
class staff extends pd{
	String jobrole;

	public staff(String name, String phono, int no, String jobrole) {
		super(name, phono, no);
		this.jobrole = jobrole;
	}

	@Override
	public String toString() {
		return "staff [jobrole=" + jobrole + ", name=" + name + ", phono=" + phono + ", no=" + no + "]";
	}	
	
}

class student extends pd{
	String dep;

	public student(String name, String phono, int no, String dep) {
		super(name, phono, no);
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "student [dep=" + dep + ", name=" + name + ", phono=" + phono + ", no=" + no + "]";
	}
	
	
}
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staff s=new staff("a","12345",12,"AP");
		System.out.println(s);
		student s1=new student("b","125478",14,"EEE");
		System.out.println(s1);
		

	}

}
