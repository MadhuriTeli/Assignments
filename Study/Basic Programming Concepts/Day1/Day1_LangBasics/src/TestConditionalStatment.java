import java.util.Scanner;

public class TestConditionalStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1, no2,no3;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1:");
		no1 = sc.nextInt();

		System.out.println("Enter No2:");
		no2 = sc.nextInt();
		System.out.println("Enter No3:");
		no3 = sc.nextInt();

//		if (no1 > no2)
//			System.out.println("Max=" + no1);
//		else
//			System.out.println("MAx=" + no2);

		System.out.println("---------------------");

//		if (no1 > no2)
//			System.out.println("Max=" + no1);
//		else if (no2 > no1)
//			System.out.println("Max=" + no2);
//		else
//			System.out.println("no1==no2");
		System.out.println("---------------------");

		if(no1>no2)
		{
			if(no1>no3)
			{
				System.out.println("Max="+no1);
			}
		}
		else if(no2>no1)
		{
		if(no2>no3)
			System.out.println("Max="+no2);
		}
			
		
		
		
		
		
		
		
	}

}
