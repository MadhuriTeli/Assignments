package p4;

public class FilePrintable implements Printable {
	@Override
	public void print(String mesg) {
		System.out.println("Storing a mesg in file "+mesg);
	}
	//Can you specify additional behavior here ? 
	
	public void test()
	{
		System.out.println("in test....");
	}
}
