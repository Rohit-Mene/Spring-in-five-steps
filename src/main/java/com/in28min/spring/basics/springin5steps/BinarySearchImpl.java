package com.in28min.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	//to do autowiring byName you can do is
	// private SortAlgorithm BubbleSortAlgorithm 
	//or QuickSortAlgorithm whichever you want
	
	//Constructor injection  and on the last line is the example of setter injection  and also you can provide no setter or getter
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm=sortAlgorithm;
	}
	
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}
	
	
	
   //setterInjection
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

}
