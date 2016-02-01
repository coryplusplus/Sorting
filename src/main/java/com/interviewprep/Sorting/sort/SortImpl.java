package com.interviewprep.Sorting.sort;

abstract public class SortImpl implements Sort {
	
	
	public  void printArray(int[] array)
	{
		for(int x : array)
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public boolean sizeValid(int[] array)
	{
		if(array.length <= 1)
			return false;
		else
			return true;
	}

}
