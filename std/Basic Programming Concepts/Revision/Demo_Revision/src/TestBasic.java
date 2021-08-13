import java.util.Scanner;

public class TestBasic {

	static {
		System.out.println("------------B4 Main Method static1 executed--------------");

	}
	static {
		System.out.println("------------B4 Main Method static2 executed--------------");

	}
	

	public static void main(String[] args) {

		System.out.println("------------in Main Method --------------");
         //scanf
		//cin
		//Scanner 
		
		//String array
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size=");
		int size=sc.nextInt();
		
			String[] names=new String[size];//
			System.out.println(names.length);
		
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter Elements=");
		names[i]=sc.next();	
			
		}
		
		System.out.println("----------------");
		
		for(int i=0;i<names.length;i++)
		{
		System.out.println(names[i]);
		}
		
		System.out.println("-----------------for each----------------");
		//simplicity with for each
		//works with collection only
		//fwd only and read only
		//start with first value till the end of collection
		
		for(String s:names)
		{
			System.out.println(s.toUpperCase());
		}
		
		
		
		
		
		
		
		
		
		

	}
	
}
