package p7;

public interface Bank {
	boolean createAccount(int acctNo, String name, double initBalance);

	void withdraw(int acctNo, double amt);
}
