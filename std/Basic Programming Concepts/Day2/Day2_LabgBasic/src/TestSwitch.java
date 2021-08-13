import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Math Operations----");
		int no1, no2, result=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("No1:");
		no1 = sc.nextInt();
		System.out.println("No2:");
		no2 = sc.nextInt();
		boolean flag = false;

		System.out.println("+:Add");
		System.out.println("-:Subs");
		System.out.println("*:Multi");
		System.out.println("/:Div");
		System.out.println("#:Exit");
		char choice;
		while (flag != true) {
			System.out.println("Enter Choice:");
			choice = sc.next().charAt(0);

			switch (choice) {
			case '+':
				result = no1 + no2;
				System.out.println("Add="+result);
				break;
			case '-':
				result = no1 - no2;
				break;
			case '*':
				result = no1 * no2;
				break;
			case '/':
				result = no1 / no2;
				break;
			case '#':
				flag = true;
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Result="+result);

		}
	}

}
