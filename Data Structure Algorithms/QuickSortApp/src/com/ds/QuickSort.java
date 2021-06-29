package com.ds;
public class QuickSort {
	
	int getPivot(int[] arr,int down,int up)
	{
		int low = down;
		int high = up;
		int pivotIdx = (low+high)/2;
		int pivot = arr[pivotIdx];  // Current value of pivot 
		swap(arr,low,pivotIdx);
		while (low < high)
		{
			while (arr[low]<=pivot && low < up)
				low++;
			while (arr[high]>pivot)
				high--;
			if (low < high)
				swap(arr,low,high);
		}
		swap(arr,down,high);
		return high;
	}
    // 	5,7,20,15,1,10,8,12,3,4,9   down = 0   up = 10
	// low = 0   high = 10
	// pi = 5  pivot = 10
	// swap on line 11    arr is 10,7,20,15,1,5,8,12,3,4,9
	// low = 2
	// high = 10
	// 1st time line 19 swap 
	// 10,7,9,15,1,5,8,12,3,4,20
	// Stops at low = 3   high = 9
	// 10,7,9,4,1,5,8,12,3,15,20
	// low = 7  high = 8
	// 10,7,9,4,1,5,8,3,12,15,20
	// low = 8  high = 7
	// While loop ends down = 0  high = 7
	// Swap arr[0] with arr[7]
	// 3,7,9,4,1,5,8,   10,   12,15,20
	
	
	public void quickSorting(int[] arr,int down,int up)
	{
		int pivotIndex;
		if(down < up)
		{
			pivotIndex = getPivot(arr,down,up);
			System.out.println("Pivot Value = " + arr[pivotIndex]);
			quickSorting(arr, down, pivotIndex-1);
			quickSorting(arr,pivotIndex+1,up);
		}
	}
	
	
	
	public void swap(int[] arr,int x,int y)
	{
			int temp;
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
	}
}