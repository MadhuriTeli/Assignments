import java.util.Scanner;

public class TestFunctions {

	public static void addition1()// no return no param
	{
		int no1, no2;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1");
		no1 = sc.nextInt();
		System.out.println("Enter No2");
		no2 = sc.nextInt();
		result = no1 + no2;
		System.out.println("Addition=" + result);

	}

	public static void addition2(int no1, int no2) {

		int result = no1 + no2;
		System.out.println("Addition=" + result);

	}

	public static int addition3() {
		int no1, no2;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1");
		no1 = sc.nextInt();
		System.out.println("Enter No2");
		no2 = sc.nextInt();
		result = no1 + no2;
		return result;

	}

	public static int addition4(int no1, int no2) {
		int result = no1 + no2;
		return result;

	}

	public static void changeCase() {
		System.out.println("Enter Name");
		String name;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		String nm = name.toUpperCase();
		System.out.println(nm);
	}

	public static void main(String[] args) {

		System.out.println("------Main----");
		// addition1();//calling fun/method

		int a = 20, b = 30;
		// addition2(a,b);//calling function/method
		// addition2(40, 34);//

//	int r=addition3();
//	System.out.println("Add="+r);	

		// int c= addition4(a, b);
		// System.out.println("Sum="+c);

		changeCase();// explicit i.e by user

	}

}
