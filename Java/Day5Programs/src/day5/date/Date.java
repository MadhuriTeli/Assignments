/*
 * Problem STatement3
3->Create Date Class with Data Members day,month, year

3.1:
Create an object and initialize it using mutator methods and accesses it using
accessor methods. Print the date.

3.2
Create two objects and initialize them using no-argument and parameterized
constructor respectively. Print the date. 
 */

package day5.date;
public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {
		dd=9;
		mm=1;
		yy=1996;
		System.out.println("Date:\t"+dd+"  "+mm+"  "+yy);
	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		System.out.println("Date:\t"+dd+"  "+mm+"  "+yy);
	}

	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
}
