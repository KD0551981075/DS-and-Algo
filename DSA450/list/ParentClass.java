package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.DoublePredicate;

public class ParentClass implements Comparator<ParentClass>, Comparable {

  public static void main(String[] args)
  {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);

    System.out.println(numbers);
    Collections.sort(numbers);
    System.out.println(numbers);

    DoublePredicate output = (a) -> (a > 2);

    System.out.println(output);


  }

  @Override
  public int compare(ParentClass o1, ParentClass o2) {
    return 0;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }

//  @Override
//  public int compareTo(ParentClass p) {
//    return 0;
//  }
}
