//package me.mayankgrover.spring.in28minutes;
//
//import me.mayankgrover.spring.componentscan.ComponentDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//@SpringBootApplication
//@ComponentScan("me.mayankgrover.spring.componentscan")
//public class SpringComponentScanApplication {
//
//	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);
//
//	public static void main(String[] args) {
//
//		ApplicationContext appContext = SpringApplication.run(SpringComponentScanApplication.class, args);
//		ComponentDAO componentDAO = appContext.getBean(ComponentDAO.class);
//
//		LOGGER.info("{}", componentDAO);
//
//	}
//
//}
