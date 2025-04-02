interface create
{
	static void oncreate() {
		System.out.println("Interface Created");
	}
}
interface start
{
	static void onstart() {
		System.out.println("Interface Started");
	}
}
interface pause{
	static void onpause() {
		System.out.println("Interface Paused");
	}
}
class Sample implements create,start,pause{
	void get() {
		create.oncreate();
		start.onstart();
		pause.onpause();
	}
}
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample s=new Sample();
s.get();
		
	}

}
