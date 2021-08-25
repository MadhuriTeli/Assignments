package tester;

import static utils.StudentCollectionUtils.populateList;
import static com.app.core.Subject.valueOf;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

public class StudentTester {

	public static void main(String[] args) {
		// Display all student details
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> students = populateList();

			boolean exit = false;
			while (!exit) {
				System.out.println("1. Display all students  2. Sort as per GPA  "
						+ "3. Sum of  gpa of students for the specified subject  "
						+ "4. Average of  gpa for the specified subject  5. Specified subject topper  "
						+ "6. failures for the specified subject  "
						+ "7. Distinctions for a specific subject  100. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Students details................");
						students.forEach(System.out::println);
						break;

					case 2:
//						students.stream().
						// sorted(Comparator.comparing(Student::getGpa).reversed()).
						// forEach(System.out::println);
//						students.sort((o1, o2) ->  ((Double) o1.getGpa())
						// .compareTo(o2.getGpa()));
//						students.sort(Comparator.comparing(s->s.getGpa()));
						students.sort(Comparator.comparing(Student::getGpa));
						System.out.println("Sorting done..................");
						break;

					case 3:
						System.out.println("Enter subject to find out sum");
						Subject sub = valueOf(sc.next().toUpperCase());
						double sumGpa = students.stream().filter(s -> s.getSubject().equals(sub))
								.mapToDouble(Student::getGpa).sum();
						System.out.println("Sum of " + sub + " is: " + sumGpa);
						break;

					case 4:
						System.out.println("Enter subject to find out Average");
						Subject sub1 = valueOf(sc.next().toUpperCase());
//						OptionalDouble avg = students.stream()
//						.filter(s -> s.getSubject().equals(sub1))
//						.mapToDouble(Student::getGpa)
//						.average();
//						System.out.println("Sum of "+sub1+" is: "+avg);
						double avg1 = students.stream().filter(s -> s.getSubject().equals(sub1))
								.mapToDouble(Student::getGpa).average().orElse(-1000);
						System.out.println("Sum of " + sub1 + " is: " + avg1);
						break;

					case 5:
						System.out.println("Enter subject to find out Max Gpa");
						Subject maxSub = valueOf(sc.next().toUpperCase());
//						OptionalDouble max = students.stream().filter(s -> s.getSubject().equals(maxSub))
//								.mapToDouble(Student::getGpa).max();
//						System.out.println("Max Gpa for " + maxSub + " is: " + max);
						double max1 = students.stream().filter(s -> s.getSubject().equals(maxSub))
								.mapToDouble(Student::getGpa).max().orElse(-1);
						
						students.stream().filter(s->s.getGpa()==max1).forEach(System.out::println);
						break;

					case 6:
						System.out.println("Enter subject to find out Failures");
						Subject failSub = valueOf(sc.next().toUpperCase());
						students.stream().filter(f -> f.getSubject().equals(failSub))
						.filter(f -> f.getGpa()<5.0)
						.forEach(s -> System.out.println("Failed students are: "+s.getName()));
						break;

					case 7:
						System.out.println("Enter subject to find out Distinctions");
						Subject distinctionSub = valueOf(sc.next().toUpperCase());
						long numb = students.stream().filter(f -> f.getSubject().equals(distinctionSub))
						.filter(d -> d.getGpa()>7.5).count();
						
						System.out.println("Number of distinction in Subject "+distinctionSub+" are "+numb);
						break;

					case 100:
						exit = true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//8.1 Create Student class -- rollNo(string),name,dob(LocalDate),subject(enum),gpa(double)
//Create Subject enum --JAVA,DBT,ANGULAR,REACT,SE
//Add constr & to string & getters.
//8.2 Create CollectionUtils ---to ret populated FIXED size list of students (4 records)
//
//1. Display all student details
//
//2 Display all student details sorted as per GPA
//
//3. Write a tester to print sum of  gpa of students for the specified subject
//(Hint : filter,map,reduce)
//
//4. Write a tester to print average of  gpa of students for the specified subject
//(Hint : filter,map,reduce)
//
//5 Print name of specified subject  topper
//(filter reduce -- max )
//
//6 Print names of  failures for the specified subject chosen  from user.
//(gpa < 5 : failed case)
//
//7. How many distinctions for a specific subject
//(gpa > 7.5 : distinction)
//filter,count
