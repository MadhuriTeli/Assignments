package p7;

public class BankOfBaroda implements Bank {
	//declare constant for min balanace
	public static final double MIN_BALANCE;
	//what is the best recommended way for initing static members ? : static initializer block
	static {
		MIN_BALANCE=1000;
	//	MIN_BALANCE++;
	}
	

	@Override
	public boolean createAccount(int acctNo, String name, double initBalance) {
		if(initBalance > MIN_BALANCE)
		{
			System.out.println("Acct created successfully in BoB ");
			return true;
		}
		System.out.println("insufficient opening balance!!!!!!!!!!!");
		return false;
	}

	@Override
	public void withdraw(int acctNo, double amt) {
		System.out.println("withdrawing from BoB a/c");

	}

}
