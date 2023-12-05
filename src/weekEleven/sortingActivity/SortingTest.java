package weekEleven.sortingActivity;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        Sorting test = new Sorting();

        int[] unsorted = test.getArray();
        System.out.print("Unsorted Array: "+Arrays.toString(unsorted));
        int[] sorted = test.sortArray(unsorted);
        System.out.print("\nSorted Array: "+Arrays.toString(sorted));

    }
}
