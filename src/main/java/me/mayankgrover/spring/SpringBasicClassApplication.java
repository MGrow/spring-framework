package me.mayankgrover.spring;

import me.mayankgrover.spring.basics.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicClassApplication {

//	What are the beans? == @Component
//	What are the dependencies of the bean? == @Autowired
//	Where to find beans? => No need to do this for now. Spring includes the package hierarchy of the class with
//	@SpringBootApplication annotation. Otherwise done via @ComponentScan

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(SpringBasicClassApplication.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = appContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {124, 6}, 3);

		System.out.println(binarySearch == binarySearch1);
		System.out.println(result);

	}

}
