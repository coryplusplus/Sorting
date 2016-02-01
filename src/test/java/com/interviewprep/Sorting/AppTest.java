package com.interviewprep.Sorting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interviewprep.Sorting.sort.Sort;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	private ApplicationContext appContext;
	private int[] result = new int[]{0, 1, 1, 1, 2, 3, 3, 4, 5, 11, 23, 23, 31, 33, 42, 44, 113, 123, 123, 1234};
	private int[] array = new int[]{1,5,123,1,0,23,4,2,11,44,31,23,42,1234,1,33,113,3,123,3};


	@Before
    public void setUp()
    {
    	appContext = new ClassPathXmlApplicationContext("/AppContext.xml");
    }

    @Test
    public void testMergeSort()
    {
    	Sort mergeSort = (Sort) appContext.getBean("mergeSort");
    	mergeSort.sort(array);
    	assertArrayEquals(array, result);
        assertTrue( true );
    }
    
    @Test
    public void testBubbleSort()
    {
    	Sort bubbleSort = (Sort) appContext.getBean("bubbleSort");
    	bubbleSort.sort(array);
    	assertArrayEquals(array, result);
        assertTrue( true );
    }
    
    @Test
    public void testRadixSort()
    {
    	Sort radixSort = (Sort) appContext.getBean("radixSort");
    	radixSort.sort(array);
    	assertArrayEquals(array, result);
        assertTrue( true );
    }
    
    @Test
    public void testQuickSort()
    {
    	Sort quickSort = (Sort) appContext.getBean("quickSort");
    	quickSort.sort(array);
    	assertArrayEquals(array, result);
        assertTrue( true );
    }
    
}
