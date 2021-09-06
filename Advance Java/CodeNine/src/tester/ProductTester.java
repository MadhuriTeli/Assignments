package tester;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dao.ProductDao;
import pojo.Product;
import static utils.ValidationUtils.validateProduct;
public class ProductTester {
	
	public static void main(String[] args) throws Exception{
		try(Scanner sc = new Scanner(System.in)){
			List<Product> products = new ArrayList<>();
			ProductDao dao = new ProductDao();
			
			boolean menu = true;
			int choice;
			while(menu) {
				System.out.println("1 Display List | 2. Add Product | 3. Exit");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Showing Products");
					for(Product p : products)
						System.out.println(p);
					break;
				case 2:
					System.out.println("Enter name,price,expiry");
					Product p = validateProduct(sc.next(),sc.nextDouble(),sc.next(),products);
					products.add(p);
					System.out.println("Product Added");
					break;
				case 3:
					try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("products.list"))) {
						out.writeObject(products);
					}
					menu = false;
					System.out.println("Thank You For Using our App");
					break;
				}

			}

		}

	}

}
