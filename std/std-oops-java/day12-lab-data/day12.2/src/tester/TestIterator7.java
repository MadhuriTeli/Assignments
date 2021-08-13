package tester;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator7 {

	public static void main(String[] args) {
		//create AL<String> containing ---  "one" , "two"....."six"
		String[] strings= {"one" , "two","three","four","five","six"};
		ArrayList<String> list=new ArrayList<>();
		for(String s : strings)
			list.add(s);//copy of refs
		//display the list : Iterator
		Iterator<String> stringItr=list.iterator();
		//append "seven" 
	//	list.add("seven");//structural modification : YES
		//remove 1st elem from the list
	//	list.remove(0);//structural modification : YES
		//replace 1st element "zero"
		list.set(0, "zero");//structural modification : NO
		
		while(stringItr.hasNext())
			System.out.println(stringItr.next());

	}

}
