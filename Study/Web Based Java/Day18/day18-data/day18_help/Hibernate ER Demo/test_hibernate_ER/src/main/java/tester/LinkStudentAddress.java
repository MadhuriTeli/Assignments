package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddressDaoImpl;
import dao.StudentDaoImpl;
import pojos.Address;
import pojos.Student;

public class LinkStudentAddress {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Student id for linking address");
			int sid=sc.nextInt();
			System.out.println("Enter Address details : city,  country,  zipCode,  phoneNo");
			Address a=new Address(sc.next(), sc.next(), sc.next(), sc.next());
			AddressDaoImpl dao=new AddressDaoImpl();
			System.out.println(dao.linkStudentAddressDetails(sid, a));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
