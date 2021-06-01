/*
1
Accept  i/ps from User , till user enters "quit" or any other option.
I/P : operation(add|sub|mult|div) , number1(double) , number2(double) 
Display the result of the operation.
It should be done in a loop , till user enters "quit" 
*/
import java.util.Scanner;
public class MenuDriven{

	public static void main(String[] args){
		double number1;
		double number2;
		int choice;
		boolean flag= false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		number1= scan.nextDouble();
		number2= scan.nextDouble();


		System.out.println("1: ADD  2: Sub  3: Mult  4: Div  5:Quit");
		
		
		
		while (flag != true) {
			System.out.println("Enter Choice");
			choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Addition= "+ (number1+number2));
				break;
			case 2: System.out.println("Substraction= " +(number1-number2));
				break;
			case 3: System.out.println("Multiplication= " +(number1*number2));
				break;
			case 4: System.out.println("Division= " +(number1/number2));
				break;
			case 5: flag = true;
				break;
			default: System.out.println("Invalid Choice");

			}		
		}
		scan.close();

	}
}
