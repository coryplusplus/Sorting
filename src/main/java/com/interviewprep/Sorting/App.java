package com.interviewprep.Sorting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interviewprep.Sorting.sort.Sort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("/AppContext.xml");
    	
    	
    	Sort mergeSort = (Sort) appContext.getBean("mergeSort");
    	int[] array = new int[]{1,5,123,1,0,23,4,2,11,44,31,23,42,1234,1,33,113,3,123,3};
    	mergeSort.printArray(array);
    	mergeSort.sort(array);
    	mergeSort.printArray(array);
    	
    	Sort bubbleSort = (Sort) appContext.getBean("bubbleSort");
    	array = new int[]{1,5,123,1,0,23,4,2,11,44,31,23,42,1234,1,33,113,3,123,3};
    	bubbleSort.printArray(array);
    	bubbleSort.sort(array);
    	bubbleSort.printArray(array);
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
