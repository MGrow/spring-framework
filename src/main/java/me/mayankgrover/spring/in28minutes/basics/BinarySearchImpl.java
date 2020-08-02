package me.mayankgrover.spring.in28minutes.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

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
}
