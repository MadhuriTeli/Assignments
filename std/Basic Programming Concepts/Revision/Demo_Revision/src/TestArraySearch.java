import java.util.Scanner;

public class TestArraySearch {

	public static void main(String[] args) {

		int[] arr = { 23, 2, 3, 55, 75, 35 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------search--------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Search:");
		int no = sc.nextInt();
		
		boolean chk=true;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==no)
			{
				chk=true;
				System.out.println("Present at :"+(i+1));
			break;
			}
			else
			{
				chk=false;
				//System.out.println("Not Present");
			}
			
		}//end of for loop
		if(chk==false)
		{
			System.out.println("Not Present");
		}
		else
		{
			System.out.println("Number Present");
		}
		

	}

}
