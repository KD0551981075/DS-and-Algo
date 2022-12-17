package array;
import java.util.Arrays;

public class DifferenceBetweenHeights {
    public static void main(String args[]) {
        //Input Data
        int[] array1 = {1, 5, 8, 10};
        int[] array2 = {-1, -2, -3, -4};
        int[] array3 = {3, 9, 12, 16, 20};

        int k = 3;
        //method calling
        differanceBetweenTheHeights(array3, k);
    }

    private static int differanceBetweenTheHeights(int[] array, int k) {

        int length = array.length;
        if (length <= 1) {
            return 0;
        }
        //sort
        Arrays.sort(array);
        //min,max at best case scenario
        int min;
        int max;
        int diff = array[length - 1] - array[0];

        //Iterate all the values for best min/max values
        for (int i = 1; i < length; i++) {
            //when minimizing check non - negative
            if (array[i] - k < 0) continue;

            min = Math.min(array[0] + k, array[i] - k);
            max = Math.max(array[length - 1] - k, array[i - 1] + k);
            //diff-minimum case
            diff = Math.min(diff, max - min);
        }
        System.out.println(diff);
        return diff;
    }
}
