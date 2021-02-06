package com.in28min.spring.basics.springin5steps.beanscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans?
			// What are the dependencies of a bean?
			// Where to search for beans? => No need

			public static void main(String[] args) {

//				 BinarySearchImpl binarySearch =
//				 new BinarySearchImpl(new QuickSortAlgorithm());
				
				
			//	 Application Context
				ApplicationContext applicationContext = 
						SpringApplication.run(SpringIn5StepsApplication.class, args);
				BinarySearchImpl binarySearch = 
						applicationContext.getBean(BinarySearchImpl.class);
				BinarySearchImpl binarySearch1 = 
						applicationContext.getBean(BinarySearchImpl.class);
				
				System.out.println(binarySearch);
				System.out.println(binarySearch1);
			// when we run the above  two sysouts we see that both binarySearch and binarySearch1 have same hashCodes,
			//Even though we write applicationContext two times in different objects we receive same bean for both object
				
				int result = 
						binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
				System.out.println(result);
			}
}
