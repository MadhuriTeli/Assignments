package p3;

public class FilePrintable implements Printable {
	@Override
	public void print(String mesg) {
		System.out.println("Storing a mesg in file "+mesg);
	}
}
