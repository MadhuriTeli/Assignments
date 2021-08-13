
public class TestVarArgs {

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
	
//	public  static void add(int[] arr)
//	{
//		
//	}
	
	//var args:0 or many number of arguments
	
	public static void sum(int... a)
	{
		System.out.println("Size="+a.length);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("Sum of "+a.length + " Elements :"+sum);
		
	}
	
	
	public static void main(String[] args) {

//		add();// n e
//		add(1,2);//n e
//		add(1,2,3);//no error
//		add(12.3,4);//no error
//		
	//	int[] arr=new int[10];
		
		int a=10;
     sum();// array size is 0
     sum(a);//size 1
     sum(a,a,a,a,a,a,a,a);//size 8
     sum(a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a);
     
     
     
  
     
     
     
     
     
     
     
     
     
     
     
     
     

	}

}
