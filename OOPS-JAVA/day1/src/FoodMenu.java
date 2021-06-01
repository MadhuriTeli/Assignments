
/*
3. Display food menu to user. User will select items from menu along with the quantity. 
(eg 1. Dosa 2. Samosa .......10 . Generate Bill ) Assign fixed prices to food items
When user enters 'Generate Bill' option(10) , display total bill & exit.
*/
import java.util.Scanner;

public class FoodMenu {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double dosa = 25.0, samosa = 10.0, poha = 15.0, idli = 30.0, pavBhaji = 50.0, vadapav = 25.0, misal = 40.0,
        tea = 10.0, coffee = 20.0;
    boolean flag = false;
    Double totalBill = 0.0;
    int choice, quantity;
    System.out.println("select items form menu along with quantity");
    System.out.println("1: Dosa---------25.0");
    System.out.println("2: Samosa-------10.0");
    System.out.println("3: Poha---------15.0");
    System.out.println("4: Idli---------30.0");
    System.out.println("5: PavBhaji-----50.0");
    System.out.println("6: VadaPav------25.0");
    System.out.println("7: Misal--------40.0");
    System.out.println("8: Tea----------10.0");
    System.out.println("9: Coffee-------20.0");
    System.out.println("10:*****Generate Bill*****");

    while (flag != true) {
      System.out.println("enter choice");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          System.out.println("enter Quntity for Dosa");
          quantity = scan.nextInt();
          totalBill += dosa * quantity;
          break;
        case 2:
          System.out.println("enter Quntity for Samosa");
          quantity = scan.nextInt();
          totalBill += samosa * quantity;
          break;
        case 3:
          System.out.println("enter Quntity for Poha");
          quantity = scan.nextInt();
          totalBill += poha * quantity;
          break;
        case 4:
          System.out.println("enter Quntity for Idli");
          quantity = scan.nextInt();
          totalBill += idli * quantity;
          break;
        case 5:
          System.out.println("enter Quntity for PavBhaji");
          quantity = scan.nextInt();
          totalBill += pavBhaji * quantity;
          break;
        case 6:
          System.out.println("enter Quntity for VadaPav");
          quantity = scan.nextInt();
          totalBill += vadapav * quantity;
          break;
        case 7:
          System.out.println("enter Quntity for Misal");
          quantity = scan.nextInt();
          totalBill += misal * quantity;
          break;
        case 8:
          System.out.println("enter Quntity for Tea");
          quantity = scan.nextInt();
          totalBill += tea * quantity;
          break;
        case 9:
          System.out.println("enter Quntity for Coffee");
          quantity = scan.nextInt();
          totalBill += coffee * quantity;
          break;
        case 10:
          System.out.println("Total Bill: " + totalBill);
          flag = true;
          break;
        default:
          System.out.println("Invalid Choice!!! Please Enter Valid Choice");
      }
    }
    scan.close();

  }
}
