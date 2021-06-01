//6:Write a java program to sort array.
import java.util.Scanner;
public class SortArray {

	public static void main(String[] args) {
int a[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array -");
		int size = sc.nextInt();
		System.out.println("Enter Array elements: ");
		a= new int[size];
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\nYour Array");
		for(int element: a)
		{
			System.out.print(" | "+element);
		}System.out.println(" | ");
		
		sortArray(a);
		sc.close();
	}
	public static void sortArray(int[] arr)
	{
		System.out.println("\nSorted Array");
//		Arrays.sort(arr);
		int temp;
		for(int i =0; i<arr.length; i++)			
		{
			int flag=0;
			for(int j=0; j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])					//10,5,7,20
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag =1;
				}
			}
			if(flag==0)
			{
				break;
			}
			
		}
		
		System.out.println("\nSorted Array");
		for(int element: arr)
		{
			System.out.print(" | "+element);
		}System.out.println(" | ");
	}
}
