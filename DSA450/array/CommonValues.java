package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonValues {
    public static void main(String args[])
    {
        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        int arr4[] = {10, 20};

        //Approach 1
        /*Set<Integer> set = new HashSet<>();
          Arrays.stream(arr1)
                .forEach(x -> set.add(x));

        Set<Integer> CommonResult12 = commonValuesUsingHashsetContains(set, arr2);
        Set<Integer> CommonResult123 = commonValuesUsingHashsetContains(CommonResult12, arr3);
        Set<Integer> CommonResult1234 = commonValuesUsingHashsetContains(CommonResult123, arr4);
        System.out.println(CommonResult1234);*/

        //Approach 2
        Set result1 = commonValuesUsingHashSetRetainsAll(arr1, arr2);
        Set result2 =commonValuesUsingHashSetRetainsAll(arr3,arr4);
        result1.retainAll(result2);
        System.out.println(result1);
    }

    //Approach using hast set contains method
    public static Set<Integer> commonValuesUsingHashsetContains(Set set, int[] arr2)
    {
        //approach using hashset, in-build function
        Set<Integer> commonValues = new HashSet<>();
        Arrays.stream(arr2).
                forEach(x-> {
                    if(set.contains(x))
                        commonValues.add(x);
                });
        return commonValues;
    }

    //Approach using Hash Set Method retails All Method
    public static Set commonValuesUsingHashSetRetainsAll(int[] arr1,int[] arr2)
    {
        Set<Integer> set1  = new HashSet<>();
        Set<Integer> set2  = new HashSet<>();

        Arrays.stream(arr1)
                .forEach(x-> set1.add(x));
        Arrays.stream(arr2)
                .forEach(x-> set2.add(x));

        set1.retainAll(set2);

        return set1;
    }
}
