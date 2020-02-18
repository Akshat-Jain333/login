package java8;

public class Bank {
	
	private int regno;
	private String name;
	private float amt;
	public Bank() {}
	static float interest() {
		return new Bank().amt*BankOperation.rate;
	}
	
	
	public Bank(int regno, String name, float amt) {
		super();
		this.regno = regno;
		this.name = name;
		this.amt = amt;
	}



	private static class BankOperation{
		static float rate=0.05f;
		static String Country="India";
		static String State="U.P";
		
		
		
		static void bankInfo() {
			System.out.println("Country is "+Country);
			System.out.println("State is "+State);
			System.out.println("Interest is "+rate);
		}
	}
	
	public static void main(String[] args) {
		Bank bank= new Bank(328561, "Central Bank", 646655.46f);
		System.out.println("Interest is "+Bank.interest());
		BankOperation.bankInfo();
	}

}
