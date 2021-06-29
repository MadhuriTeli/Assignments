package com.ds;


public class QuickSortDemo {
	public static void main(String[] args) {
		int[] arr = {5,7,20,15,1,10,8,12,3,4,9};
		QuickSort sort = new QuickSort();
		sort.quickSorting(arr, 0, arr.length-1);
		System.out.println("After Quick Sort");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " , ");
		}
	}
}