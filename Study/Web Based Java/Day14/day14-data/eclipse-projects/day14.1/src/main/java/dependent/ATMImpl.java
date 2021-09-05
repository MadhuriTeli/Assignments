package dependent;

import dependency.Transport;

public class ATMImpl implements ATM {
	private Transport myTransport;// =new HttpTransport();//dependency

	private ATMImpl() {
		System.out.println("in cnstr of " + getClass().getName() + " " + myTransport);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing " + amt);
		byte[] data = ("depositing " + amt).getBytes();
		myTransport.informBank(data);// dependent obj invoking method of dependency

	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing " + amt);
		byte[] data = ("withdrawing " + amt).getBytes();
		myTransport.informBank(data);
	}

	

	// custom init method
	public void myInit() {
		System.out.println("in init " + myTransport);
	}

	// custom destory method
	public void myDestroy() {
		System.out.println("in destroy " + myTransport);
	}
	//factory method for D.I
	public static ATMImpl myFactory(Transport t)
	{
		System.out.println("in factory method "+t);//called by SC
		ATMImpl atm=new ATMImpl();//dependent obj : Prog
		atm.myTransport=t;//set the dependency/ies : Prog
		return atm;
		
	}

}