package me.mayankgrover.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgo;

    public BinarySearchImpl(SortAlgorithm sortAlgo) {
        this.sortAlgo = sortAlgo;
    }

    public int binarySearch(int[] nums, int searchVal) {

        // Sorting the array
        int[] sortedNums = sortAlgo.sort(nums);
        // Print sort obj being used
        System.out.println(sortAlgo);

        // Search: Assume we have searched

        // Return value (exists/does not/index .. whatever)
        return 3;
    }
}
