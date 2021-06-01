package first.pack3;

import first.pack1.Student;
import first.pack2.Batch;

public class Test {

	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.setRollNo(10);
		stud1.accept();
		stud1.display();
		
		
		Batch batch1 = new Batch();
		batch1.accept();
		batch1.display();
		

	}

}
