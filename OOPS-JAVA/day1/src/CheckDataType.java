
/*
2. Accept 2 double values from User (using scan). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.
*/
import java.util.Scanner;

public class CheckDataType {
  public static void main(String[] args) {
    double avg = 0.0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter num1 double value");
    if (scan.hasNextDouble()) {
      double num1 = scan.nextDouble();
      System.out.println("Enter num2 double value");
      if (scan.hasNextDouble()) {
        double num2 = scan.nextDouble();
        avg = (num1 + num2) / 2;
        System.out.println("Average of two Numbers = " + avg);
      } else {
        System.out.println("Please Entered the Double Value.");
        System.out.println("You entered: " + scan.next());
      }
    } else {
      System.out.println("Please Entered the Double Value.");
      System.out.println("You entered: " + scan.next());
    }
    scan.close();
  }
}