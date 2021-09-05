package dao;

import pojos.Address;

public interface IAddressDao {
	/*
	 * 5. Link student's address details i/p : student id n address deatils
	 * (city,country,zip,phone)
	 */
	String linkStudentAddressDetails(int studentId, Address a);
	/*
	 * 6. Update city (i.e some address details) i/p student id n new city
	 */
	String updateCity(int studentId,String city);
}
