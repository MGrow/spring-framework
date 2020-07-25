package me.mayankgrover.spring.basics;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringMasterClassApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {124, 6}, 3);
		System.out.println(result);

//		ApplicationContext
//		ApplicationContext appContext = SpringApplication.run(SpringMasterClassApplication.class, args);

	}

}
