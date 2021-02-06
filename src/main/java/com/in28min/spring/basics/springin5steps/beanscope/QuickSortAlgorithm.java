package com.in28min.spring.basics.springin5steps.beanscope;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}
}
