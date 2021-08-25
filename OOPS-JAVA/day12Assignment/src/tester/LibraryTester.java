package tester;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import custom_exception.*;

import static com.core.app.BookCategory.valueOf;
import static com.core.app.Book.sdf;

import com.core.app.Book;
import com.core.app.BookCategory;

import custom_exception.BookHandlingException;

import static utils.CollectionUtils.populate;

public class LibraryTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable D.S
			ArrayList<Book> list = populate();
			System.out.println("Book Details:-");
			for (Book b : list)
				System.out.println(b);
			boolean exit = true;

			while (exit) {
				System.out.println("0. Display all available books using Iterator ,1. Issue out book " + "2. Return book " + "3. Apply discount on old books "
						+ "4. Sort the books as per Issue numb 5.Sort the books on publish date & author");
				try {
					switch (sc.nextInt()) {
					case 0:
						Iterator<Book> itr=list.iterator();
						while(itr.hasNext()) {
							Book book = itr.next();
							System.out.println(book);
						}
						break;
						
					case 1:
						System.out.println("Issue Out Book.......!!!!");
						System.out.println("Enter Issue numb");
						
						int index = list.indexOf(new Book(sc.nextInt()));
						
//						int index = emps.indexOf(new Emp(sc.nextInt()));
						if(index == -1) {
							throw new BookHandlingException("Issued Book number book was not available, Please check details.....");
						}
						Book book1 =list.get(index);
//						System.out.println("Quantity available "+book1.getQuantity()+" and you can take out books only "+(book1.getQuantity()-1));
//						System.out.println("Enter Quantity");
						int quantity1 = sc.nextInt();
						if (book1.getQuantity()<=quantity1) {
							throw new BookHandlingException(book1.getQuantity()+" Books available only");
						}
						book1.setQuantity(book1.getQuantity()-quantity1);
//						if(book1.getQuantity() <= 5 && book1.getQuantity() > 1) {
//							System.out.println("Books available are less in number");
//						}
//						else if(book1.getQuantity() == 1) {
//							System.out.println("Only One book is available");
//						}
						break;

					case 2:
						System.out.println("Return Book.......!!!!");
						System.out.println("Enter Issue numb");
						
						int index2 = list.indexOf(new Book(sc.nextInt()));
						
						if(index2 == -1) {
							System.out.println("Book is not already available in library do you want to Add as new 1. for adding 0 for return");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("Enter issueBookNo, Name, Author, Price, BookCategory , Quantity, PublishDate(dd-MM-yyyy");
								list.add(new Book(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),valueOf(sc.next().toUpperCase()),sc.nextInt(),sdf.parse(sc.next())));
							}
							break;
						}
						
						// int issueBookNo, String name, String author, Double price, BookCategory category, int quantity, Date publishDate
						
						Book book2 =list.get(index2);
						System.out.println("Enter Quantity");
						int quantity2 = sc.nextInt();
						book2.setQuantity(book2.getQuantity() + quantity2);
						break;

					case 3:
						System.out.println("Return Book.......!!!!");
						System.out.println("Enter Issue numb");
						Iterator<Book> itr3 = list.iterator();
						while(itr3.hasNext()) {
							Book b = itr3.next();
							b.setPrice(b.getPrice()-(b.getPrice()*0.2));
							System.out.println(b);
						}
						break;

					case 4:
						System.out.println("We're Sorting...........");
						Iterator<Book> itr4 = list.iterator();
						while(itr4.hasNext()) {
							Book b = itr4.next();
							System.out.println(b);
						}
						Collections.sort(list);
						Iterator<Book> itr42 = list.iterator();
						while(itr42.hasNext()) {
							Book b = itr42.next();
							System.out.println(b);
						}
						break;
						
					
						
					case 100:
						exit = false;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
