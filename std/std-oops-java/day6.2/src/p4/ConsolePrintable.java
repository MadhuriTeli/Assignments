package p4;

public  class ConsolePrintable implements Printable{
	@Override
	public void print(String message)
	{
		System.out.println("Printing a mesg on console "+message);
		//access data : imple class can DIRECTLY access i/f constants
		System.out.println(DATA);
	}

}
