package me.mayankgrover.spring.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        // Assume we have sorted
        return numbers;
    }
}
