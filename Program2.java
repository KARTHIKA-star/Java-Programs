class A1
{
	void get(int a)
	{
		System.out.println("The value of a is:"+a);
	}
}
class B1 extends A1
{
	void get(int a,int b)
	{
		System.out.println("The value of a and b is:"+a+" " +b);
	}
	String get(String name)
	{
		return (name);
	}
}
class C1 extends B1
{
	void get(int a,int b,String name)
	{
		System.out.println("The value of a,b and name is:"+a+" "+b+" "+name);
	}
}
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c=new C1();
		c.get(10);
		c.get(20,31);
		System.out.println(c.get("The name is:"+"Karthika"));
		c.get(31,40,"Suji");
		

	}

}
