class A11
{
	void display() {
		
		System.out.println("Class A called");
	}
}
class B11 extends A11{
	void display() {
		super.display();
		System.out.println("Class B called");
	}
}
class C11 extends B11{
	void display() {
		super.display();
		System.out.println("Class C called");
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C11 c =new C11();
		c.display();

	}

}
