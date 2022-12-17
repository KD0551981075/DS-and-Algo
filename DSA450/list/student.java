package list;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class student {
  public static void main(String args[]) {
    List<studentInner> students = new ArrayList<>();
    students.add(new studentInner("c", 13, 78, "commerce"));
    students.add(new studentInner("c1", 12, 35, "commerce"));
    students.add(new studentInner("s", 13, 78, "science"));
    students.add(new studentInner("s1", 12, 35, "science"));
    students.add( new studentInner("a", 13, 78, "arts"));
    students.add( new studentInner("a1", 12, 35, "arts"));

    studentInner minimumMarks = students
      .stream()
        .min(Comparator.comparing(studentInner -> studentInner.marks))
          .orElseThrow(NoSuchElementException::new);

    System.out.println(minimumMarks);

//      students.stream()
//      .filter(each -> each.marks>)
//      .map(x -> new studentInner(x.marks, x.department)).min((x, y) -> (x.marks).compareTo(y).get();
//    System.out.println(minimumMarks);
  }
}

@AllArgsConstructor
@Getter
class studentInner {
  String name;
  int age;
  int marks;
  String department;

}
