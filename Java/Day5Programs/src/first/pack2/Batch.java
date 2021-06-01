package first.pack2;

import java.util.Scanner;

public class Batch {
	private int batchId;
	private String batchName;
	Scanner sc = new Scanner(System.in);
	public void accept() {
		System.out.println("Enter Id and Name");
		batchId = sc.nextInt();
		batchName = sc.next();
		sc.close();
	}
	public void display() {
		System.out.println("BatchId "+batchId+ "BatchName "+batchName);
	}
	
	

}
