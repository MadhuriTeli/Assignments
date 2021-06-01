package day5.date;
public class TestDate {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.setDd(11);
		d1.setMm(11);
		d1.setYy(2011);
		System.out.print("date:\t");
		System.out.println(d1.getDd()+"  "+d1.getMm()+"  "+d1.getYy());
		
		System.out.println("");
		Date d2 = new Date();
		
		System.out.println("");
		Date d3 = new Date(22,12,2022);
	}

}