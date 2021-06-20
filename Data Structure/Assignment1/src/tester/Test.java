package tester;

import com.ds.Stack;

public class Test {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(12);
		st.push(4);
		st.push(53);
		st.push(60);
		try {
		System.out.println(st.pop());
		System.out.println(st.pop());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		st.push(345);
		st.push(223);
		st.push(11);
		st.push(2);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		try {
		System.out.println(st.pop());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
