package me.mayankgrover.spring.in28minutes;

import me.mayankgrover.spring.in28minutes.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext appContext =
					 new AnnotationConfigApplicationContext(SpringPropertiesApplication.class)) {

			SomeExternalService service = appContext.getBean(SomeExternalService.class);
			System.out.println(service.getUrl());
		}
	}

}
