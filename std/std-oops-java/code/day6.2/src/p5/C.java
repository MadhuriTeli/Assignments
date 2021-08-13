package p5;

public class C implements A, B {
	@Override
	public double calc(double a, double b) {
		System.out.println(A.DATA+" "+B.DATA);
      return a+b;
	}
	
}
