
public class Date {
	
	private int day,month,year;
public Date()
{
	}
	
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//acceptDate(){}
	//constr()//
	
	public void setDay(int day)//setter
	{
		this.day=day;
		
	}
	public int getDay()//getter
	{
		return day;
		
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
	
	public void displayDate()
	{
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
