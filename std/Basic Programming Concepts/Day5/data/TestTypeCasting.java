
public class TestTypeCasting {
public static void main(String[] args) {
	
	
	//Widening Casting (automatically) - converting a smaller type to a larger type size
	//byte -> short -> char -> int -> long -> float -> double
	
	int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double implicit

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    
    
    //Narrowing Casting (manually) - converting a larger type to a smaller size type
   // double -> float -> long -> int -> char -> short -> byte
    
    double myDouble1 = 9.78;
    int myInt1 =  (int) myDouble1; // Manual casting: double to int

    System.out.println(myDouble1);   // Outputs 9.78
    System.out.println(myInt1);      // Outputs 9
    
    
    
    //Java program to find ASCII value of a character
    char ch='A';
    int asc=(int)ch;
    System.out.println("ASCII:"+asc);
    
    String name="Vaishali";
    
    
    
    char[] arr=name.toCharArray();
    //show all ASCII value of all chars in name
    //Java program to find ASCII value of a character
    
    
}
}
