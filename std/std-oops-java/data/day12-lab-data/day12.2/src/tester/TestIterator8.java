package tester;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator8 {

	public static void main(String[] args) {
		//create AL<String> containing ---  "one" , "two"....."six"
		String[] strings= {"one" , "two","three","four","five","six"};
		ArrayList<String> list=new ArrayList<>();
		for(String s : strings)
			list.add(s);//copy of refs
		//display the list : Iterator
		Iterator<String> stringItr=list.iterator();
		while(stringItr.hasNext()) {
			System.out.println(stringItr.next());
			stringItr.remove();
//			stringItr.remove();//IllegalStateException
		}
		System.out.println(list);//empty list

	}

}
