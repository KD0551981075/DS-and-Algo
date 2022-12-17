package StringDS.StreamsAPI;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ThirdLargest {

  public static void main(String args[]) {
    //e1,e2,e3,e4,e5,e6
    List<EmployeeInner> EmployeeList = new ArrayList<>();
    //setting the data
    EmployeeList.add(new EmployeeInner("emp1", 145000, new Date()));
    EmployeeList.add(new EmployeeInner("emp2", 155000, new Date()));
    EmployeeList.add(new EmployeeInner("emp3", 150000, new Date()));
    EmployeeList.add(new EmployeeInner("emp4", 100000, new Date()));
    EmployeeList.add(new EmployeeInner("emp5", 160000, new Date()));
    EmployeeList.add(new EmployeeInner("emp6", 145000, new Date()));

    //Business logic
    // Largest salary
    String thirdHighestSalariedEmployee = new String();
//      EmployeeList.stream()
//      .max(Comparator.comparing(EmployeeInner::getSalary))
//      .get().getName();

    Integer secondHighest = EmployeeList.stream()
      .map(x -> x.getSalary())
      .sorted(Comparator.reverseOrder())
      .limit(3)
      .skip(1)
      .findFirst()
      .get();

    Integer thirdHighest = EmployeeList.stream()
      .map(x -> x.getSalary())
      .sorted(Comparator.reverseOrder())
      .skip(2)
      .findFirst()
      .get();

    System.out.println(thirdHighest);

  }
}

@AllArgsConstructor
@Getter
class EmployeeInner {
  String name;
  Integer salary;
  Date DOJ;

}
