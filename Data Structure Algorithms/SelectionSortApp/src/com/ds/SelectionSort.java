package com.ds;
public class SelectionSort {
	public void selectionSorting(int[] arr)
	{
		int i,j,smallestIdx;
		for (i=0;i<arr.length-1;i++)
		{
			smallestIdx = i;
			for (j=i+1;j<arr.length;j++)
			{
				if (arr[j] < arr[smallestIdx])
					smallestIdx = j;
			}
			swap(arr,i,smallestIdx);
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