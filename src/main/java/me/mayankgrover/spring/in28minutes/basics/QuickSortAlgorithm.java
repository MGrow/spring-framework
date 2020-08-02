package me.mayankgrover.spring.in28minutes.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quickSort")
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        // Assume we have sorted
        return numbers;
    }
}
