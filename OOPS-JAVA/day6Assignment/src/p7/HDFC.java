package p7;

public class HDFC implements Bank {
	//declare constant for min balanace
	public static final double MIN_BALANCE;
	//what is the best recommended way for initing static members ? : static initializer block
	static {
		MIN_BALANCE=5000;
	}
	

	@Override
	public boolean createAccount(int acctNo, String name, double initBalance) {
		if(initBalance > MIN_BALANCE)
		{
			System.out.println("Acct created successfully in HDFC ");
			return true;
		}
		System.out.println("insufficient opening balance!!!!!!!!!!!");
		return false;
	}

	@Override
	public void withdraw(int acctNo, double amt) {
		System.out.println("withdrawing from HDFC a/c");

	}
	//can HDFC prvide addtional services ? YES
	public void payBills()
	{
		System.out.println("paying bills using HDFC a/c");
	}

}
