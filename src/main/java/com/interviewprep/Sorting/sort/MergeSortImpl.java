package com.interviewprep.Sorting.sort;

public class MergeSortImpl extends SortImpl {
	
	public void sort(int[] array)
	{
		if(!sizeValid(array))
			return;
		int[] first = new int[array.length /2];
		int[] second = new int[array.length - first.length];
		
		System.arraycopy(array, 0, first, 0, first.length);
		System.arraycopy(array, first.length, second, 0, second.length);
		
		sort(first);
		sort(second);
		
		mergeSort(first, second, array);
		
	}
	
	public void mergeSort(int[] first, int[] second, int[] results)
	{
		int iFirst = 0, iSecond = 0, iResults = 0;
		
		while(iFirst < first.length && iSecond < second.length)
		{
			if(first[iFirst] < second[iSecond])
			{
				results[iResults] = first[iFirst];
				iFirst++;
			}
			else
			{
				results[iResults] = second[iSecond];
				iSecond++;
			}
			iResults++;
		}
		
		System.arraycopy(first, iFirst, results, iResults, first.length - iFirst);
		System.arraycopy(second, iSecond, results, iResults, second.length - iSecond);
	}

}
