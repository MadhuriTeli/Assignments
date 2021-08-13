import java.util.Scanner;

public class TestTwoDArray {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	int[][] arr=new int[3][3];
	System.out.println("Enter Array Element");
	for(int i=0;i<3;i++)//for row
	{
		
		for(int j=0;j<3;j++)//for columns
		{
			
			arr[i][j]=sc.nextInt();
		}
		
	}
	System.out.println("--------------");
	
	for(int i=0;i<3;i++)//for row
	{
		
		for(int j=0;j<3;j++)//for columns
		{
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
	}
		
	
	
	
	sc.close();
}
}
