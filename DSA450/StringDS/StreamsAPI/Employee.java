package StringDS.StreamsAPI;

import lombok.*;
import java.util.regex.*;
import java.util.List;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Employee {

  private String ID;
  private  String name;
  private int salary;
  private String address;


}
