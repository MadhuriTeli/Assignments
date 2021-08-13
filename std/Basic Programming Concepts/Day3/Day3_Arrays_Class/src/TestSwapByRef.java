
public class TestSwapByRef {

	public static void SwapByValue(int a,int b)
	{
		//a b are local variables
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Inside swap a="+a+"  b="+b);
	}
	
	
	public static void swapByRef(int[] arr)
	{
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("\nInside swap a="+arr[0]+"  b="+arr[1]);
	
	}
	public static void main(String[] args) {

        int a=10,b=20;
        System.out.println("Before swap a="+a+"  b="+b);
        
        SwapByValue(a, b);
        
        System.out.println("After swap a="+a+"  b="+b);
        
        //
        int[] arr= {a,b};//arr[0]=a,arr[1]=b;
        
        System.out.println("\n Before swap a="+arr[0]+"  b="+arr[1]);
    	
        swapByRef(arr);
        
        System.out.println("\n After swap a="+arr[0]+"  b="+arr[1]);
    	
        
        
        
        
        
        
        
        
        
        
        

	}

}
