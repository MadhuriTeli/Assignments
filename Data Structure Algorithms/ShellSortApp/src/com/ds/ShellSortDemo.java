package com.ds;


public class ShellSortDemo {

	public static void main(String[] args) {
		// Created an array of size 20
		int[] arr = {30,15,20,1,4,9,8,23,32,40,5,7,10,12,26,29,33,6,11,14};
		ShellSort sort = new ShellSort();
		sort.shellSorting(arr);
		System.out.println("After applying shell sort algorithm");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " , ");
		}
	}
}