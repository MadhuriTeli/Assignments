//9:Create Date class with  data members day,month,year.create getter setter for data members.writ display function to display date.

public class Date {
	private int day, month, year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("Day:" + day);
		System.out.println("Month:" + month);
		System.out.println("Year:" + year);
	}
}
