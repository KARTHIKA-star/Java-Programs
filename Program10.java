class base{
	void display() {
	System.out.println("This is base class");
}
}
class derived extends base{
	void display1() {
		System.out.println("This is derived class");
	}
}
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is constractor program");
         derived d=new derived();
         d.display();
         d.display1();

	}

}
