
/*9:Sum of series :
	1+2+3+….+n
	*/
import java.util.Scanner;
public class SumOfSeries {

	public static void main(String[] args) {
		int num, sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number \n");
		num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("Sum "+sum);

	}

}
