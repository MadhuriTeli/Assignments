import java.util.Scanner;

public class TestArrays {

	public static void main(String[] args) {
	
		
		int[] arr= {1,2,3,4,5};//static
		int[] arr1=new int[3] ;
		arr1[0]=10;//static
		arr1[1]=20;//static
		arr1[2]=30;//static
		
		System.out.println("Enter Size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();//accept size i.e length from user
		
		int[] data=new int[size];
		
		//reading array element using for loop
		//length is attribute to show size of aaray
		for(int i=0;i<data.length;i++)
		{
			data[i]=sc.nextInt();//reading value for index 0,1,2,3,4
			
		}
		System.out.println("--------------------");
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		System.out.println("----enter number to search----");
		int num=sc.nextInt();
		boolean f=true;
		int index=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==num)
			{f=true;
			index=i;
			break;
			}
			else
			{
				f=false;
			}
		}
		if(f==true)
		{
			System.out.println("Num is present at "+index);
		}else
		{
			System.out.println("Num is not present ");
		}
		
		System.out.println("------------sort----------");
		int temp;
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i]>data[j])
				{
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
				
			}
		}
		
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		
		

	}

}
