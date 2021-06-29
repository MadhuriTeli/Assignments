package tester;

import java.util.Scanner;

import com.ds.BracketsMatching;

public class TestBrackets {

	public static void main(String[] args) {
		BracketsMatching bracket=new BracketsMatching();
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter input");
		bracket.check(ip.next());
		ip.close();

	}

}
