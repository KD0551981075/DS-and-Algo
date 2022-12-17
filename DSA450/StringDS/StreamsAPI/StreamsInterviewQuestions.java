package StringDS.StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInterviewQuestions {

  public static void main(String args[]) {
    //Given a list of integers
    List<Integer> numbersList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

    //Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
    //printEvenNumbers(numbersList);

    //Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    //printNumbersStartingWith(numbersList);

    numbersList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
    //Q3 How to find duplicate elements in a given integers list in java using Stream functions?
    printDuplicateElements(numbersList);


  }

  private static void printDuplicateElements(List<Integer> numbersList) {
//    HashMap<Integer, Integer> valuecount = new HashMap<>();
//
//    Stream<HashMap<Integer, Integer>> result = numbersList
//      .stream()
//      .map(num ->
//      {
//        //if exist, update the values
//        if (valuecount.containsKey(num))
//          valuecount.put(num, valuecount.get(num) + 1);
//          //else, just add to map
//        else
//          valuecount.put(num, 1);
//
//        return valuecount;
//      });
//
//    System.result.collect(Collectors.toList());

    Set<Integer> setInt = new HashSet<>();
    numbersList
      .stream()
      .filter(each->!setInt.add(each))
      .forEach(System.out::println);


  }

  private static void printNumbersStartingWith(List<Integer> numbersList) {
    numbersList
      .stream()
      //converting the integer to string,
      // so it can be used for getting the starting index
      .map(each -> each + "")
      .filter(each -> each.startsWith("1"))
      .forEach(System.out::println);
  }

  public static void printEvenNumbers(List<Integer> numbersList) {
    numbersList
      .stream()
      //find out all the even numbers exist
      .filter(eachNum -> eachNum % 2 == 0)
      .forEach(System.out::println);
  }
}
