class A
{
	void display() {
		
		System.out.println("Class A called");
	}
}
class B extends A{
	void display() {
		super.display();
		System.out.println("Class B called");
	}
}
class C extends B{
	void display() {
		super.display();
		System.out.println("Class C called");
	}
}
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c =new C();
		c.display();

	}

}
