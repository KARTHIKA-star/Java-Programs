 class Products
{
	int Proid;
	String Proname;
	double price;
	public Products() {
		super();
		
	}
	public Products(int proid, String proname, double price) {
		super();
		this.Proid = proid;
		this.Proname = proname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [Proid=" + Proid + ", Proname=" + Proname + ", price=" + price + "]";
	}
	
	
}
public class Program5 {
	public static void main(String args[]) {
		Products p=new Products();
		p.Proid=11;
		p.Proname="Bag";
		p.price=100.76;
		System.out.println(p);
		Products p1=new Products(11,"Pen",200.90);
		System.out.println(p1);
	}
	
	

}
