package me.mayankgrover.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMasterClassApplication {

//	What are the beans? == @Component
//	What are the dependencies of the bean? == @Autowired
//	Where to find beans? => No need to do this for now. Spring includes the package hierarchy of the class with
//	@SpringBootApplication annotation. Otherwise done via @ComponentScan

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

//		ApplicationContext
		ApplicationContext appContext = SpringApplication.run(SpringMasterClassApplication.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {124, 6}, 3);
		System.out.println(result);

	}

}
