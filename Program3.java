class Product
{
	private int proid;
	private String name;
	private double price;
	public Product() {
		super();
	}
	public Product(int proid, String name, double price) {
		super();
		this.proid = proid;
		this.name = name;
		this.price = price;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setProid(101);
		p.setName("karthi");
		p.setPrice(100.09);
		System.out.println(p.getProid());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		

	}

}
