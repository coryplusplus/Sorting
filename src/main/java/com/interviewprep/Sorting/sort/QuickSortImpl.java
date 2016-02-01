package com.interviewprep.Sorting.sort;

public class QuickSortImpl extends SortImpl{

	public void sort(int[] array) {
		if(!sizeValid(array))
			return;
		quickSort(array, 0, array.length - 1);
		
	}
	
	private void quickSort(int[] array, int low, int high)
	{
		int i = low, j = high;
		int p = array[low + (high - low)/2];
		
		while(i < j)
		{
			while(array[i] < p)
				i++;
			while(array[j] > p)
				j--;
			if(i <= j)
			{
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		if(low < j)
		{
			quickSort(array, low, j);
		}
		if(i < high)
		{
			quickSort(array, i, high);
		}
	}

}
