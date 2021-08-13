
public class TestTerneryOp {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int max;
		if (a > b)
			max = a;
		else
			max=b;
		System.out.println("Max=" + max);
		
		a=1;b=30;
		
		int m=(a>b)?a:b;
		System.out.println("Maximum="+m);

	}
}
