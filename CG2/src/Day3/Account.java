package Day3;

public class Account { //constructor
	String name;
	String type;
	long accno;
	String branch;
	double bal;
	static String bankname ="ICICI";
	public Account(String name, String type, long accno, String branch)
	{
		this.name = name;
		this.type = type;
		this.accno = accno;
		this.branch = branch;
		
	}
	public void showbankname()
	{
		System.out.println(bankname);
	}
	public void showaccountdetails() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(accno);
		System.out.println(branch);
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		 System.out.println(bal);
	}
	public void withdraw(double amt) {
		bal=bal-amt;
		System.out.println(bal);
	}
	public void checkbal() {
		System.out.println(bal);
	}

	public static void main(String[] args) {
		Account a1 = new Account("xyz","Saving",123445556, "btm");
		a1.showaccountdetails();
		a1.deposit(1000.0);
		a1.withdraw(600.0);
		
		// TODO Auto-generated method stub

	}

}
