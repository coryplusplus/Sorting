package com.interviewprep.Sorting.sort;

public class BubbleSortImpl extends SortImpl {

	public void sort(int[] array) {
		if(!sizeValid(array))
			return;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 1; j < array.length - i; j++)
			{
				if(array[j] < array[j-1])
				{
					//Swap
					array[j] = array[j] ^ array[j-1];
					array[j-1] = array[j-1] ^ array[j];
					array[j] = array[j] ^ array[j-1];
				}
			}
		}
	}

}
