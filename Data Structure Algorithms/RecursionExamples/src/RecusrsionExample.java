
public class RecusrsionExample {
	// A recursive method to return factorial of an integer
		int fact(int n)
		{
			//Base condition
			if (n==0)
				return 1;
			else
				return n*fact(n-1);  // Method calls itself
		}
		
		// A recursive method to return nth term of fibonacci series
		int fibo(int n)
		{
			if (n<=2)
				return (n-1);
			else
				return fibo(n-1)+fibo(n-2);
		}

		// A recursive method to print integers from 1 to n
		// Demo of head recursion
		public void printIntegers(int n)
		{
			if (n > 0)
			{
				printIntegers(n-1);
				System.out.print(n+" ");
			}
		}
		
		//Tower of Hanoi
		public void toh(int n,String src,String tgt,String aux)
		{
			if (n==0)
				return;
			else
			{
				toh(n-1,src,aux,tgt);
				System.out.println("Move disk " + n + " from " + src + " to " + tgt);
				toh(n-1,aux,tgt,src);
			}
		}
	public static void main(String[] args) {
		RecusrsionExample obj = new RecusrsionExample();
		// Compute factorial of 6
		System.out.println("Factorial of 6:");
		System.out.println(obj.fact(6));
		System.out.println("First 10 terms of fibonacci series:");
		//Print first 10 terms of fibonacci series
		for (int i=1;i<=10;i++)
		{
			System.out.println(obj.fibo(i));
		}
		//Print first 5 integers
		System.out.println("First 5 integers are:");
		obj.printIntegers(5);
		System.out.println();
		System.out.println("Tower of Hanoi:");
		// Tower of Hanoi
		System.out.println("Move 3 disks ");
		obj.toh(3, "Source", "Destination", "Helper");
	}

}
