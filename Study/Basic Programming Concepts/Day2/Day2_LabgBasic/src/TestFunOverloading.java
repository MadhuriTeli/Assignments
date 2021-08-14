
public class TestFunOverloading {
	
	
	public static void add()
	{
	System.out.println("adding");	
	}
	public static void add(int i,int j)
	{
		System.out.println("Add="+(i+j));
	}
	public static void add(int i,int j,int k)
	{
		System.out.println("Add="+(i+j+k));
	}
	public static void add(double i,int j)
	{
		System.out.println("Add="+(i+j));
	}
	public static void add(String i,String j)
	{
		System.out.println("Add="+(i+" "+j));
	}
public static void main(String[] args) {
	
	int a=20,b=30;
	double d1=12.45;
	
	add();//no param
	add(a,b);
	//add(a,b,a,a);
	add(d1,a);
	add("hello","vaishali");
	//add(a,d1);//compile time error
}
}
