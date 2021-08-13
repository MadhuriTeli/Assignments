import java.util.Scanner;

public class TestSwitchCase {

	public static void main(String[] args) {

		System.out.println("----Math Operations----");
		int no1, no2, result=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("No1:");
		no1 = sc.nextInt();
		System.out.println("No2:");
		no2 = sc.nextInt();
		boolean flag = false;

		System.out.println("1:Add");
		System.out.println("2:Subs");
		System.out.println("3:Multi");
		System.out.println("4:Div");

		int choice;
		while (flag != true) {
			System.out.println("Enter Choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				result = no1 + no2;
				break;
			case 2:
				result = no1 - no2;
				break;
			case 3:
				result = no1 * no2;
				break;
			case 4:
				result = no1 / no2;
				break;
			case 5:
				flag = true;
				break;
				
			}
			System.out.println("Result="+result);

		}

	}

}
