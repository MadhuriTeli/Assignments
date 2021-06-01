//3:Write a java program to make the addition of two 2D array And store result in Third array.
import java.util.Scanner;
public class AdditionOf2DArray {

	public static void main(String[] args) {
		int a[][], b[][], c[][];
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NUmber of Rows: ");
		n= sc.nextInt();
		System.out.println("Enter NUmber of Columns: ");
		m= sc.nextInt();
		a= new int [n][m];
		b= new int[n][m];
		
		System.out.println("Enter Elements of First Array: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("\nEnter Elements of Second Array: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		
		c= new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				c[i][j]=a[i][j] + b[i][j];
			}
		}	
		System.out.println("\nFirst 2D Array: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("\nSecond 2D Array: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("\nSum of First & Second 2D Arrays: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("");
		}
		
	sc.close();

	}

}
