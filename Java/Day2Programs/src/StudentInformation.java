/*
  2:Write a program which will accept student 
  information like rollno,name,5 subject marks.
  calculate total and percentage.calculate grade.. 
           per >75 grade :A
           per<74 and >60 :B
           per<59  :C
 */

import java.util.Scanner;
public class StudentInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rollNo;
		float total =0, percentage=0 ,englishMarks, mathsMarks, scienceMarks, historyMarks, socialMarks;
		String name;
		System.out.println("enter Roll No and Name");
		rollNo = sc.nextInt();
		name = sc.next();

		System.out.println("enter englishMarks, mathsMarks, scienceMarks, historyMarks, socialMarks");
		englishMarks = sc.nextFloat();
		mathsMarks= sc.nextFloat();
		scienceMarks= sc.nextFloat();
		historyMarks=sc.nextFloat();
		socialMarks = sc.nextFloat();
		
		total = englishMarks+mathsMarks+scienceMarks+historyMarks+socialMarks;
		float avg = total/500;
		percentage = avg*100;
		System.out.println("Total "+total);
		System.out.println("percentage "+percentage);
		if(percentage > 75) {
			System.out.println("You Got A Grade");
		}else if(percentage <74 && percentage > 60) {

			System.out.println("You Got B Grade");
		}
		else {
			System.out.println("You Got C Grade");
		}
	}

}
