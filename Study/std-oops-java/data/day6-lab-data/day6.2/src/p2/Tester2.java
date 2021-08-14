package p2;

public class Tester2 {

	public static void main(String[] args) {
		Printable p;// interface type of reference
		// Can i/f ref DIRECTLY refer to ANY imple. class instance ? : YES
		p = new ConsolePrintable();// up casting
		p.print("new mesg...");// javac chks by type of ref : chks if print method exists in Printable i/f
								// --yes
		// no err. JVM resolves : by type of object : print : ConsolePrintable : run
		// time poly
		p = new FilePrintable();// up casting
		p.print("anoter mesg");//print : FilePrintable
	}

}
