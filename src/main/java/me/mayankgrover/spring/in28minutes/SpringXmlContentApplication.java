package me.mayankgrover.spring.in28minutes;

import me.mayankgrover.spring.in28minutes.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlContentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringXmlContentApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext appContext =
					 new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO xmlPersonDAO = appContext.getBean(XmlPersonDAO.class);

			LOGGER.info(String.valueOf(xmlPersonDAO));
			LOGGER.info(String.valueOf(xmlPersonDAO.getXmlJdbcConnection()));
		}
	}

}
