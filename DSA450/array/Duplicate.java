package array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate {

    public static void main(String args[])
    {
        int[] nums = {1,2,3,1};
        //List<Integer> nums = Arrays.asList(numsValues);
       //System.out.println("Using collectors groupBy Approach"+containsDuplicateUsingCollectorsGroupBy(nums));
        System.out.println("Using collectors set Approach"+usingSet(nums));
    }



    private static boolean usingSet(int[] nums)
    {


        Integer[] collectionData = Arrays.stream(nums).boxed().toArray(Integer[]::new);    
        Set<Integer> set = new HashSet<>();

//        List<Integer> duplicate = Stream.of(collectionData)
//                .filter(eachValues -> !set.add(eachValues))
//                .collect(Collectors.toList());
//
        List<Integer> duplicate = Stream.of(collectionData)
                .filter(eachValues -> !set.add(eachValues))
                .collect(Collectors.toList());


        return duplicate.isEmpty() ? false : true;
    }
    private static boolean containsDuplicateUsingCollectionsFrequency( int[] nums) {
        List<Integer> collectionData = Arrays.stream(nums).boxed().collect(Collectors.toList());

        List<Integer> duplicateValues = collectionData.stream()
                .filter(eachValue -> Collections
                        .frequency(collectionData, eachValue) > 1)
                .collect(Collectors.toList());

        return duplicateValues.isEmpty() ? false : true;

    }


    public static boolean containsDuplicateUsingCollectorsGroupBy(int[] nums) {


        List<int[]> Duplicatevalues = Stream.of(nums)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(et -> et.getValue() > 1)
                .map(et -> et.getKey())
                .collect(Collectors.toList());

        return Duplicatevalues.isEmpty() ? false : true;
    }
}
