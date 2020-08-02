package me.mayankgrover.spring.in28minutes;

import me.mayankgrover.spring.in28minutes.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringScopeApplication.class, args);
        PersonDAO personDao = appContext.getBean(PersonDAO.class);

        PersonDAO personDao2 = appContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnection());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnection());
    }

}
