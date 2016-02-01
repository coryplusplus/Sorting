package com.interviewprep.Sorting.sort;

public class RadixSortImpl extends SortImpl{

	public void sort(int[] array) {
		if(!sizeValid(array))
			return;
		int m = 0, exp = 1;
		
		for(int i = 0; i < array.length; i++)
		{
			m = Math.max(m, array[i]);
		}
		
		int[] b = new int[array.length];
		while(m/exp != 0)
		{
			int[] bucket = new int[10];
			for(int i = 0; i < array.length; i++)
			{
				bucket[(array[i]/exp)%10]++;
			}
			for(int i = 1; i < bucket.length;i++)
			{
				bucket[i] += bucket[i-1];
			}
			
			for(int i = array.length - 1; i >= 0; i--)
			{
				b[--bucket[(array[i]/exp)%10]] = array[i];
			}
			
			for(int i = 0; i < array.length; i++)
			{
				array[i] = b[i];
			}
			
			
			exp*=10;
		}
	}

}
