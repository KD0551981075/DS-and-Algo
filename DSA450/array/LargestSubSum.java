package array;

import java.util.Arrays;

/*
kadane's Algorithm
Given an array Arr[] of N integers.
Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
*/
public class LargestSubSum {

    public static void main(String args[]) {
        //Input Data
        int[] array1 = {1, 2, 3, -2, 5};
        int[] array2 = {-1, -2, -3, -4};

        System.out.println(Arrays.stream(array2).average());

        //method calling
        //printLargestSumInSubArray(array2);
    }

    static void printLargestSumInSubArray(int[] inputArray) {

        int sum = 0;
        int greatest = inputArray[0];
        for (int i = 0; i < inputArray.length; i++)
        {
            sum = sum + inputArray[i];
            if(sum>greatest)
                greatest = sum;
            if(sum < 0)
                sum = 0;
        }
        System.out.println(greatest);
    }
}
