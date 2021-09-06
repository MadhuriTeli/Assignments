package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import custException.ProductCustomException;
import pojo.Product;

public class ValidationUtils {
	
	public static DateTimeFormatter dtf;

	static {
		dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
	}
	public ValidationUtils() {
		System.out.println("In Validation Utls");
	}
	
	public static Product validateProduct(String name,double price,String expiry,List<Product> p) throws ProductCustomException{
		LocalDate dt = validDate(expiry);
		Product product = new Product(name,price,dt);
		duplicateCheck(p,product);
		expireCheck(dt);
		
		return product;
	}
	
	public static void expireCheck(LocalDate expiry) throws ProductCustomException {
		if(expiry.isAfter(LocalDate.now())) {
			throw new ProductCustomException("Adhich Expire Zhala");
		}
	}
	
	public static void duplicateCheck(List<Product> list,Product p) throws ProductCustomException{
		if(list.contains(p))
			throw new ProductCustomException("Already Exist");
	}
	
	public static LocalDate validDate(String date) throws ProductCustomException{
		LocalDate dt = LocalDate.parse(date,dtf);
		return dt;
	}
}
