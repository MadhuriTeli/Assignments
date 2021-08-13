package IacsdStudent;

public class TestStudent {

	public static void main(String[] args) {
		
		
		
		Student s=new Student();
		//s.name="vaishali";//private not outside class
		s.rollno=90;//default outside class but in same package;
		s.total=90;//outside class but in same package;
		s.address="pune";//everywhere 
		s.acceptData();
		s.displayData();
		
	}
}
