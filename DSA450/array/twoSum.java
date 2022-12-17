package array;

import java.util.*;

public class twoSum {

    public static void main(String args[]) {

        //System.out.println(repeatChar("narasimha"));
        long arr1[] = {1, 3, 5, 7};
        long arr2[] = {0, 2, 6, 8, 9};
        //arrangeArrays(arr1, arr2, arr1.length, arr2.length);

        String inputString = "narasimhan";
       System.out.println( "Max Occurance : "+macOccurence(inputString));

    }

    //input str, output (ch,count)
    public static HashMap<Character, Integer> repeatChar(String input) {
        HashMap<Character, Integer> repeatValues = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); i++) {
            if (repeatValues.containsKey(input.charAt(i)))
                repeatValues.put(input.charAt(i), repeatValues.get(input.charAt(i)) + 1);
            else
                repeatValues.put(input.charAt(i), 1);
        }
        return repeatValues;
    }

    public static void arrangeArrays(long[] arr1, long[] arr2, int n, int m) {
        long[] sumArray = new long[n + m];
        //add a1+a2;
        System.arraycopy(arr1, 0, sumArray, 0, n);
        System.arraycopy(arr2, 0, sumArray, n, m);

        //sort them
        sumArray = Arrays.stream(sumArray).sorted().toArray();

        //copy values to individual arrays
        System.arraycopy(sumArray, 0, arr1, 0, n);
        System.arraycopy(sumArray, n, arr2, 0, m);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static char macOccurence(String inputString) {
      //  Integer maxValue = Collections.max(repeatChar(inputString).values());

        //logic : using max function
        return repeatChar(inputString).entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
       // return repeatChar(inputString).entrySet().stream().map(x->(x.getValue()==maxValue) ? x.getKey() : ' ');
    }


}
