
public class TestDate {

	public static void main(String[] args) {

		Date dob = new Date(8, 5, 1982);
		dob.setYear(1990);
		dob.displayDate();
		
		
		Date doj = new Date();//
		doj.setDay(11);
		doj.setMonth(5);
		doj.setYear(2021);
		doj.displayDate();
		
		System.out.println("Day:"+doj.getDay());
		System.out.println("Month"+doj.getMonth());
		System.out.println("YEar"+doj.getYear());

	}

}
