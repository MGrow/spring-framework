package me.mayankgrover.spring.in28minutes.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("quickSort")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] nums, int searchVal) {

        // Sorting the array
        int[] sortedNums = sortAlgorithm.sort(nums);
        // Print sort obj being used
        System.out.println(sortAlgorithm);

        // Search: Assume we have searched

        // Return value (exists/does not/index .. whatever)
        return 3;
    }

    @PostConstruct
    public int something() {
        LOGGER.info("Post Construct");
        return 0;
    }

    @PreDestroy
    public int somethingElse() {
        LOGGER.info("Pre Destroy");
        return 0;
    }
}
