package ano_inner3;

public class Tester {

	public static void main(String[] args) {
		//new Fruit() => instance of the ano inner class which extends Fruit
		//name of ano inner cls generated by javac : Tester$1
		Fruit f1=new Fruit() {

			@Override
			public void taste() {
				System.out.println("sweet");
			}		
		
		};
		f1.taste();

	}

}
