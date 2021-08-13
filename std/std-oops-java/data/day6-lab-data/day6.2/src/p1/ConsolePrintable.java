package p1;

public  class ConsolePrintable implements Printable{
	@Override
	public void print(String message)
	{
		System.out.println("Printing a mesg on console "+message);
	}

}
