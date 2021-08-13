
public class Student {

	private int rollno;
	private String name;

	private static int count;
	private static double discount;
	private static int iMarks;
	static {
		System.out.println("---------static block 1 get invoked------");
		discount=20;
		iMarks=10;
		
	}
	static {
		System.out.println("---------static block 2 get invoked------");
	}
	static {
		System.out.println("---------static block 3 get invoked------");
	}
	static {
		System.out.println("---------static block 4 get invoked------");
	}
	public Student(int rollno, String name) {

		this.rollno = rollno;
		this.name = name;
		count = count + 1;
		
		
		
	}

	public void display() {
		System.out.println("Count:" + count + "  rollNO:" + rollno + " Name:" + name);

	}

	public static void showCount() {
		System.out.println("Total Student:" + count);

	}
	public static void showDiscount()
	{
		System.out.println("Discount:"+discount  +"%    iMarks="+iMarks);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
