package com.ds;

public class ShellSort {
	
	public void shellSorting(int[] arr)
	{
		int i,k,h,hcnt,j,temp;
		// An array to store shell values
		int[] shells = new int[10];
		
		// Create shells array
		for (i=0,k=1;k<arr.length;i++)
		{
			shells[i] = k;
			k = 2*k + 1;
		}
		/*
		 * If array is of size 20, after the above loop 
		 *  shells[0] = 1, shells[1] = 3, shells[2] = 7, shells[3] = 15
		After the above loop ends, value of i will become 4
		shells[4] = 0. Hence decrement the value of i
		 */
		i--;
		
		
		for (;i>=0;i--)  // 1st consider shells[3], then shells[2], etc
		{
			h = shells[i];
		    // Loop on the sub-arrays
			for (hcnt = h;hcnt < 2*h; hcnt++)
			{
				// Apply insertion on every hth element of the sub-array
				for (j=hcnt;j<arr.length;j+=h)
				{
					temp = arr[j];
					k = j;
					while ((k-h)>=0 && temp < arr[k-h])
					{
						arr[k] = arr[k-h];
						k = k-h;
					}
					arr[k] = temp;
				}
			}
		}
		
		
		
		
	}
	
	
	

}
	
	
	
