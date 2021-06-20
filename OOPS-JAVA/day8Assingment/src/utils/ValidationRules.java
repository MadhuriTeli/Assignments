package utils;
import com.app.custom_exception.CustomerHandlingException;
import static com.app.customer.Customer.sdf;

import java.text.ParseException;
import java.util.Date;
public class ValidationRules {
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;
	public static Date thresholdDate;
	static {
		MIN_LENGTH=4;
		MAX_LENGTH=10;
		try {
		thresholdDate=sdf.parse("1-1-1995");
		}catch(ParseException e) {
			System.out.println("err in static init block " +e);
		}
	}
	
	public static String validateEmail(String email)throws CustomerHandlingException
	{
		if(email.contains("@")&&email.endsWith(".com"))
			return email;
		throw new CustomerHandlingException("Invalid Email Format");
	}
	
	public static String validatePassword(String password) throws CustomerHandlingException
	{
		if(password.length()< MIN_LENGTH || password.length()> MAX_LENGTH ) {
			throw new CustomerHandlingException("Invalid Password");
		}
		return password;
	}
	
	public static double validateAmount(double amount)throws CustomerHandlingException
	{
		if(amount%500 != 0) {
			throw new CustomerHandlingException("Invalid Amount");
		}
		return amount;
	}
	
	public static Date convertDate(String dob) throws ParseException,CustomerHandlingException
	{
		Date d1= sdf.parse(dob);
		if(d1.after(thresholdDate))
			throw new CustomerHandlingException("Invalid Date");
		return d1;
	}
}
