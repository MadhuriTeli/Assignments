package com.ds;
public class BracketsMatching {

		public void check(String str) {
			Stack stack = new Stack(100);
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
					stack.push(str.charAt(i));
				} else if (!stack.isEmpty() && str.charAt(i) == ']'  && stack.peek() == '[')  {
					stack.pop();
				} else if (!stack.isEmpty() && str.charAt(i) == ')' && stack.peek() == '(') {
					stack.pop();
				} else if (!stack.isEmpty() && str.charAt(i) == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
					count++;
				}
			}

			if (count != 0) {
				System.out.println("The Brackets do not match");
			} else if (stack.isEmpty()) {
				System.out.println("The Brackets match");
			} else {
				System.out.println("The Brackets do not match");
			}
	}


	

}
