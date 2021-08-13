import java.util.Scanner;

public class TestStudArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println(" RollNo Name  Total");
		int r = sc.nextInt();// rollno

		String nm = sc.next();// name

		int tot = sc.nextInt();// total

		Student s1 = new Student(r, nm, tot);

		s1.display();// show all stud info

		Student[] allStud = new Student[5];

		// allStud[0]=s1;

		for (int i = 0; i < allStud.length; i++) {

			System.out.println(" RollNo Name  Total");
			r = sc.nextInt();// rollno

			nm = sc.next();// name

			tot = sc.nextInt();// total

			//Student s = new Student(r, nm, tot);
			
			Student s=new Student();
			//s.acceptStudent(r, nm, tot);
							
			allStud[i] = s;

		}
		System.out.println("---------------------");
		for (int i = 0; i < allStud.length; i++) {

		allStud[i].display();
		
		}
		System.out.println("----------------------------");
		
		for(Student a:allStud)
		{
		a.display();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
