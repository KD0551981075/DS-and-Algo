package array;

public class CountInversions {
    public static void main(String args[]) {
        long[] inputNumbers = {2, 4, 1, 3, 5};
        inversionCount(inputNumbers, inputNumbers.length);
        System.out.println("Number of inversions are " + mergeSort(inputNumbers, 5));

    }

    static public long inversionCount(long[] arr, int N) {
        // Your Code Here
        //traditional code
        int count = 0;
        for (int i = 0; i < N; i++) {
            int j = i + 1;
            while (j < N) {
                if (i < j)
                    if (arr[i] > arr[j])
                        count++;
                j++;
            }
        }

        //using streams

        System.out.println(count);
        return count;
    }

    static int mergeSort(long arr[], int array_size)
    {
        long temp[] = new long[array_size];
        return _mergeSort(arr, temp, 0, array_size - 1);
    }
    // This is a recursive merge sort function that
    // sorts the array[start..end]
    static int _mergeSort(long arr[], long temp[], int start, int end)
    {
        int mid, inv_count = 0;
        if (end > start) {

            mid = (start + end) / 2;

            // Inversion count will be sum of inversions in
            // left-part and right-part of the array
            inv_count = _mergeSort(arr, temp, start, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, end);

            // Merge the two parts
            inv_count += merge(arr, temp, start, mid + 1, end);
        }
        return inv_count;
    }

    // This function merges two sorted arrays
    // and returns inversion count in the arrays.
    static int merge(long arr[], long temp[], int start,
                     int mid, int end)
    {
        int i, j, k;
        int inv_count = 0;

        i = start; // i is index for left subarray
        j = mid; // j is index for right subarray
        k = start; // k is index for resultant merged subarray
        while ((i <= mid - 1) && (j <= end)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];

                // this is tricky -- see above explanation/
                // diagram for merge()
                inv_count = inv_count + (mid - i);
            }
        }

        // Copy the remaining elements of left subarray
        // (if there are any) to temp
        while (i <= mid - 1)
            temp[k++] = arr[i++];

        // Copy the remaining elements of right subarray
        // (if there are any) to temp
        while (j <= end)
            temp[k++] = arr[j++];

        // Copy back the merged elements to original array
        for (i = start; i <= end; i++)
            arr[i] = temp[i];

        return inv_count;
    }

}
