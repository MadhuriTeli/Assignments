/*
11:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchesed items. 
 */
import java.util.Scanner;
public class Shop {

	public static void main(String[] args) {
		System.out.println("----stationary shop----");
		Scanner sc = new Scanner(System.in);
		int total = 0;
		boolean flag = false;

		System.out.println("1:Pen  2:Pencil  3:NoteBook  4:Bottle  5:ColorBox   6: exit");

		int choice;
		while (flag != true) {
			System.out.println("Enter Choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1: total +=10;
			break;
			case 2: total +=5;
			break;
			case 3: total +=20;
			break;
			case 4: total +=30;
			break;
			case 5: total +=50;
			break;
			case 6: flag= true;
			break;
			default:
				System.out.println("Invalid choice");		
			}
			System.out.println("Total= "+total);
		}
	}

}
