package me.mayankgrover.spring.in28minutes;

import me.mayankgrover.spring.in28minutes.cdi.SomeCdiBusiness;
import me.mayankgrover.spring.in28minutes.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiApplication.class);

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringCdiApplication.class, args);
        SomeCdiBusiness someCdiBusiness = appContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{} - dao {}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
    }

}
