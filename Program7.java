abstract class Bankopeartions{
	int balance=3000;
	abstract void calinterest();
	void deposit(double amount) {
		System.out.println("Available Balance:"+balance);
		balance+=amount;
		System.out.println("After the deposit:"+balance);
	}
	void withdraw(double amount) {
		balance-=amount;
		System.out.println("The withdraw amount is:"+amount);
		System.out.println("After the Withdraw:"+balance);
	}
}
	class Savingsaccount extends Bankopeartions{
	void calinterest() {
		double rate;
		rate=balance*0.04;
		System.out.println("The Rate of Interest is:"+rate);
		
	}
	}
	class Currentaccount extends Bankopeartions{
		void calinterest() {
			double rate;
			rate=balance*0.08;
			System.out.println("The Rate of Interest is:"+rate);
			
		}
	}
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Savingsaccount s=new Savingsaccount();
	s.deposit(1000);
	s.withdraw(300);
	s.calinterest();
	
	
	}
}
