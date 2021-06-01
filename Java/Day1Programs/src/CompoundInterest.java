//3:Find the compound amount and compound interest on the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.
import java.lang.Math;
public class CompoundInterest {

	public static void main(String[] args) {
		double compoundAmount=0, principal = 20000, rate = 6;
		int years=3;
		compoundAmount =( principal*(Math.pow((1+(rate/100)), years)));
		System.out.println("Compound Amount="+compoundAmount);
		
		double CompoundInterest = compoundAmount - principal;
		System.out.println("Compound Interest="+ CompoundInterest);

	}

}
