
public class TestString {

	public static void main(String[] args) {
		
		System.out.println("----String----");
		
		int a=10;
		double d=90.90;
		
		String name="vaishali",lastName=" Chikhalkar";
		
		System.out.println(a);
		System.out.println(name+lastName);
		
		System.out.println("UpperCase:"+name.toUpperCase());
		
		System.out.println("LowerCase:"+name.toLowerCase());
		char[] arr=name.toCharArray();
		
		for(char c:arr)
		{
			System.out.println(c);
		}
		
		System.out.println("--------------");
		
		char c1='A';
		char c2='B';
		
		String result=String.valueOf(c1)+String.valueOf(c2);
		
		System.out.println(result);
		
		
		
		
		
		
		
		
	}

}
