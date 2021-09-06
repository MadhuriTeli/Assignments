package com.app.tester;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

import com.app.dao.MenuDaoImpl;
import com.app.pojo.Menu;

public class Tester {

	public static void main(String[] args){

		try (Scanner sc = new Scanner(System.in)) {
			List<Menu> menu;
			MenuDaoImpl dao = new MenuDaoImpl();
			int choice = 1;
			while (choice != 0) {
				System.out.println("Enter Your Choice");
				System.out.println("1. Add Menu 2. Delete Menu Item 3. Update Menu Item 4. Display All Item 5. Write Menu Data to File 6. Read Data from File 0. Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Menu Name,Time,Price");
					Menu m1 = new Menu(sc.next(), sc.next(), sc.nextDouble());
					dao.addMenu(m1);
					break;
				case 2:
					System.out.println("Enter Menu ID to Delete");
					dao.deleteMenu(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter Menu ID and Price to Update with");
					dao.updateMenu(sc.nextInt(), sc.nextDouble());
					break;
				case 4:
					menu = dao.allMenu();
					for(Menu m : menu)
						System.out.println(m);
					break;
				case 5:
					//Implement Pojo with Serializable
					System.out.println("Enter Menu ID");
					try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("menu.txt"))) {
						out.writeObject(dao.getMenu(sc.nextInt()));		//Instead Can Retrieve From List by Overriding compareTo
					}
					break;
				case 6:
					System.out.println("Enter File Name");
					try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(sc.next()))){
						System.out.println(in.readObject());
					}
					break;
				case 0:
					System.out.println("Parat Bhetu");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
