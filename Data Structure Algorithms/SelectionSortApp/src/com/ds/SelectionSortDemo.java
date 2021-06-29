package com.ds;
public class SelectionSortDemo {

	public static void main(String[] args) {
		int[] arr = {10,5,2,9,12,4,1,6};
		SelectionSort sort = new SelectionSort();
		sort.selectionSorting(arr);
		System.out.println("After selection sort:");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}