package Interview;

// Java implementation to find the maximum
// LCM of pairs in an array
import java.util.*;
class GFG {

    // Function comparing all LCM pairs
    static int maxLcmOfPairs(int arr[], int n)
    {
        // To store the highest LCM
        int maxLCM = -1;

        // To generate all pairs from array
        for (int i = 0; i < n-1; i++) {


                // Find LCM of the pair
                // Update the maxLCM if this is
                // greater than its existing value
                maxLCM = Math.max(maxLCM, (arr[i] * arr[i+1]) / __gcd(arr[i], arr[i+1]));

        }

        // Return the highest value of LCM
        return maxLCM;
    }

    static int __gcd(int a, int b)
    {
        return b == 0 ? a : __gcd(b, a % b);
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 17, 3, 8, 6 };
        //136
        //17,3 =51  3,8=24  8,6 =24
        int n = arr.length;

        System.out.print(maxLcmOfPairs(arr, n));
    }
}

// This code is contributed by sapnasingh4991
