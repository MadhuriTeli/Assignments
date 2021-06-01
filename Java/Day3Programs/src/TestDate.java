
public class TestDate {

	public static void main(String[] args) {
		Date d1= new Date();
		//Date d2 = new Date(1 ,1, 2);
		//d2.displayInfo();
		d1.setDay(1);
		d1.setMonth(4);
		d1.setYear(1998);

		d1.displayInfo();
		d1.setMonth(8);
		d1.setYear(2021);
		System.out.println("Day: "+ d1.getDay());
		System.out.println("Month: "+ d1.getMonth());
		System.out.println("year: "+ d1.getYear());
	}

}