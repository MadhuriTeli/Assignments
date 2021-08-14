
public class TestOverloading {

	public static void add(int  a,int b)
	{
		System.out.println("Add="+(a+b));
	}
	public static void add(int  a,int b,int c)
	{
		System.out.println("Add="+(a+b+c));
	}
	public static void add(double  a,double b)
	{
		System.out.println("Add="+(a+b));
	}
	public static void add(double  a,int b)
	{
		System.out.println("Add="+(a+b));
	}
	
	public static void add(int i,int j,int k,int m)
	{
		
	}
	
	
	public static void sum(int... a)// 0 or many arguments
	{
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			total=total+a[i];
		}
		System.out.println("Total Sum="+total);
	}
	public static void display(String... name)
	{
		
	}
	public static void displayStudInfo(int rollno,String... skills)
	{
		
	}
	

	
	
	
	
	public static void main(String[] args) {
	
//poly-morph  i.e many-form of same
	
		
	//	add(12.2, 23.4);//add(double  a,double b)//static signature
		add(1,2);;//add(int  a,int b)//static signatiye
		add(1,2,3);//add(int  a,int b,int c)//s s
		add(12.4,7);//add(double  a,int b)
		add(1,2,3,4);//write on
		             
		             //add 14 numbers,35nubers,100,1000,7,9,156 n is not fix
		
		int a=1;
		System.out.println("------------------------------");
		sum();//
		sum(a);//for this execution array size 1 
		sum(a,a,a,a,a,a,a,a,a,a);//size 10
		sum(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		sum(a,a,a,1,2,3);
		
		
		
		
		
	}

}
