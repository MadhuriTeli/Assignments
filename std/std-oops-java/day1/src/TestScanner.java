
/*
Solve : Write java application to accept int(emp id) , double(salary) ,
 emp's first name , is permanent :  boolean from Scanner & display the same using printf
*/
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        // create a scanner object , wrapping stdin
        Scanner sc = new Scanner(System.in);
        // sc++;
        System.out.println("Enter emp id , salary, name permanent status");
        System.out.printf("Emp Id %d Salary %.2f Name %s Is Permanent %b %n", sc.nextInt(), sc.nextDouble(), sc.next(),
                sc.nextBoolean());
        // close the scanner
        sc.close();
    }

}
