package utils;

import static com.app.core.Customer.sdf;
import static com.app.core.CustomerCategory.valueOf;
import static com.app.core.CustomerCategory.values;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.CustomerCategory;

import custom_exception.CustomerHandlingException;

public class ValidationRules {
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;
	public static Date thresholdDate;
	static {
		MIN_LENGTH = 4;
		MAX_LENGTH = 10;
		try {
			thresholdDate = sdf.parse("1-1-1995");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	// add a static method to validate email
	public static String validateEmail(String em) throws CustomerHandlingException {
		if (em.contains("@") && em.endsWith(".com"))
			return em;// rets validated email to the caller
		// throw Throwable instance
		throw new CustomerHandlingException("Invalid email format!!!!!");
	}

	// add a static method to validate password
	public static String validatePassword(String password) throws CustomerHandlingException {
		if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH)
			throw new CustomerHandlingException("Invalid password length!!!!!");
		return password;
	}

	// add static method for validating reg amount
//	public static double validateRegAmount(double amount) throws CustomerHandlingException {
//		if (amount % 500 != 0)
//			throw new CustomerHandlingException("Invalid reg amount!!!!");
//		return amount;
//	}

	// add a static method to convert string ---> date
	public static Date convertDate(String dob) throws ParseException, CustomerHandlingException {

		Date d1 = sdf.parse(dob);// conversion
		// date conversion success
		if (d1.after(thresholdDate))
			throw new CustomerHandlingException("Invalid date!!!!!!!!");
		// date validation success
		return d1;// rets parsed n validated date to the caller

	}

	// add a static method to validate category along with reg amount
	public static CustomerCategory validateCategory(double amount,String category) throws CustomerHandlingException {
		try {
			//convert category (string) --- enum
			CustomerCategory chosenCategory=valueOf(category.toUpperCase());
			//category valid ---chk if user is paying required amount --yes --ret category
			if(amount != chosenCategory.getCharges())
				throw new CustomerHandlingException("Invalid amount paid for the chosen plan , Pay ");
			// javac : public static CustomerCategory valueOf(String name) throws
			// IllegalArgumentExce.
			return chosenCategory;
		} catch (IllegalArgumentException e) {
			StringBuilder sb = new StringBuilder("Invalid Category Chosen \n ");
			sb.append("Valid Categories : \n");
			sb.append(Arrays.toString(values()));
			// System.out.println(sb);
			throw new CustomerHandlingException(sb.toString());

		}
	}
	//add a static method to find customer details by email
	public static Customer findCustomerByEmail(String email,Customer[] custs) throws CustomerHandlingException
	{
		//done by Customer's equals
		//create customer instance by wrapping email (unique id)
		Customer c1=new Customer(email);
		for(Customer c: custs)
			if(c != null && c.equals(c1))
				return c;
		throw new CustomerHandlingException("Customer not found : invalid email id!!!!!!");
				
		
	}

}
