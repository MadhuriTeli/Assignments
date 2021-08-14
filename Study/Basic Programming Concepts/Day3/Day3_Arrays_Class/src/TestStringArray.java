
public class TestStringArray {

	
	public static void  acceptArray(String[] names)
	{
		//display each name from string array
		
		//for loop
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i].toUpperCase());
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		for(int i=0;i< args.length;i++)
		{
			System.out.println(args[i]);
			
		}
		System.out.println("-----------------");
		
		// TODO Auto-generated method stub

		String[]  arr= {"vaishali","sonali","trupti","monica","gayatri","manish","chetan"};
		
		acceptArray(arr);
		//accept name of student..chk it is exist or not
		
		
	}

}
