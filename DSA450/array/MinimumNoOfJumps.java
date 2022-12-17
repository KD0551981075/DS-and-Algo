package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNoOfJumps {

    public static void  main(String args[])
    {
        int N = 11;
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        List<String> sampleValues = Arrays.asList("");
        minJumps( N, arr);

    }

    private static int minJumps(int n, int[] arr) {
        int pointer = 0;
        int jump = 0;

        if(arr[0] == 0)
        {
            return -1;
        }

        for(int i = pointer; i <= n; i = i)
        {
            if(pointer >= n)
                break;
            pointer = arr[pointer+i];
            jump++;

        }


        return -1;
    }
}
