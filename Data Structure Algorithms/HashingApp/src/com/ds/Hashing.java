package com.ds;

public class Hashing {
	// Radix Transformation hash method
	// New Radix base as 13
	public int myHash(int element)
	{
		int newValue=0;
		int copyElement = element;
		int i=0;
		int dig;
		while (copyElement > 0)
		{
			dig = copyElement % 10;
			newValue = newValue + (int)Math.pow(13, i)*dig;
			i++;
			copyElement /= 10;
		}
		return newValue%100;
	}
}