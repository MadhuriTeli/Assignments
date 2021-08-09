package p4;

public class Tester1 {

	public static void main(String[] args) {
		
		Printable p = new FilePrintable();//up casting 
		p.print("some mesg");//run time poly (Dyn method dispatch)
		
     //   p.test();//no print method in Printable
		
		//down casting
		((FilePrintable)p).test();//no javac err, no run time err
		
	//	p=new ConsolePrintable();//up casting
	//	p.test();//no print method in Printable
	//	((FilePrintable)p).test();//no javac err , run time : ClassCastExc : ConsolePrintable can not be cast into FilePrintable
		if(p instanceof FilePrintable)
			((FilePrintable)p).test();
		else
			System.out.println("Invalid type of object!!!!!!!!!!!!");
		//how to access DATA ?
		System.out.println(Printable.DATA);
	}

}
