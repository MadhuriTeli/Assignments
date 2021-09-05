package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddressDaoImpl;

public class UpdateAddressCity {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Student id for updating address");
			int sid=sc.nextInt();
			System.out.println("Enter new city");
			
			AddressDaoImpl dao=new AddressDaoImpl();
			System.out.println(dao.updateCity(sid, sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
