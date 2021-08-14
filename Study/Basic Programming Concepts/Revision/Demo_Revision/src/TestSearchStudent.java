import java.util.Scanner;

public class TestSearchStudent {
	public static void main(String[] args) {

		Student[] stud = new Student[5];

		for (int i = 0; i < stud.length; i++) {
			Student s = new Student();
			s.acceptStudent();
			stud[i] = s;

		}
		System.out.println("---------------------");
		for (int i = 0; i < stud.length; i++) {
			stud[i].display();
		}
		System.out.println("------------Search---------");

		System.out.println("Enter RollNo To Serach");

		// int rNo=new Scanner(System.in).nextInt();

		Scanner sc = new Scanner(System.in);
		int rNo = sc.nextInt();

		for (int i = 0; i < stud.length; i++) {

			// System.out.println(stud[i].getRollno());

			if (stud[i].getRollno() == rNo) {
				System.out.println("Present");
//stud[i].display();//show all details of searched stud
				// read new Total from user
				// set it to object

				System.out.println(" Enter Name:");
				String str = sc.next();
				stud[i].setName(str);
			}

		}

		System.out.println("-------------------------");
		for (Student s : stud) {
			s.display();
		}

	}
}
