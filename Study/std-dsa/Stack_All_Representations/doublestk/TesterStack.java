package com.doublestk;

public class TesterStack {

	public static void main(String[] args) {
		DoubleStack s1=new DoubleStack(10);//default is 5 but we can pass size also
		
		s1.push1(10);
		s1.push1(20);
		s1.push1(30);
		s1.push1(40);
		//System.out.println("peek : "+s1.peek1());
		
		
		s1.push2(100);
		s1.push2(200);
		s1.push2(300);
		s1.push2(400);
		s1.push2(500);
		s1.push2(600);
		//System.out.println("peek : "+s1.peek2());
		s1.push1(90);//full error
		
		s1.stkwisedisplay();
		
		System.out.println(s1.pop1());
		System.out.println(s1.pop1());
		System.out.println(s1.pop1());
		System.out.println(s1.pop1());
		System.out.println(s1.pop1());//empty error top1==-1
		
		System.out.println(s1.pop2());
		System.out.println(s1.pop2());
		System.out.println(s1.pop2());
		System.out.println(s1.pop2());
		System.out.println(s1.pop2());
		System.out.println(s1.pop2());
		
		
	}

}
