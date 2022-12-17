package StringDS.StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterNames {

  public static void main(String args[]) {
    List<String> names = Arrays.asList("ankit", "asha", "bishal", "bhanu");

//    output : BISHAL,BHANU
    names.stream()
      .filter(name -> name.startsWith("b"))
      .map(name -> name.toUpperCase())
      .collect(Collectors.toList())
      .forEach(filterNames -> System.out.println(filterNames));

  }

}
