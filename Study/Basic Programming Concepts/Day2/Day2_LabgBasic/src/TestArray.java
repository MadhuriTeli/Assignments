import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		// Array
		int[] arr = new int[5];
		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 15;
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------");
		String[] names=new String[] {"radha","sham","meera","neha","ram","sham"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		System.out.println("----------------------");
		int[] arrs=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arrs.length;i++)
		{
			arrs[i]=sc.nextInt();
			
		}
		System.out.println("----------------");
		for(int i=0;i<arrs.length;i++)
		{
			System.out.println(arrs[i]);
		}
		//for each loop
		for(int i:arrs)
		{
			System.out.println(i);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
