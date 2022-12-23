package StringDS.StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    static public void main(String args[]) {

        List<Employee> employeeCollection = getEmployeeRecords();
        //System.out.println(printRecords(employeeCollection));

        //sortEmployees();

        System.out.println(getCapitalEmployee());

    }

    private static List<String> getCapitalEmployee() {
        String filterLetter = "b";
        List<String> employeeList = Arrays.asList("ankit", "asha", "bisha", "bhanu");

        return employeeList.stream()
                .filter(each -> each.startsWith("b"))
                .map(each -> each.toUpperCase())
                .collect(Collectors.toList());


    }

    private static void sortEmployees() {

        //e1,e2,e3,e4
        //e1,e2 ->e1
        //e1,e3 -> e1
        //e1,e4
        // 123,124,234,345,

        List<Employee> employeeData = getEmployeeRecords();
        employeeData.stream()
                .sorted((e1, e2) -> e1.getID().compareTo(e2.getID()))
                .map(e -> new Employee(e.getID(), e.getName(), e.getSalary(), e.getAddress()))
                .forEach(e -> System.out.println("id:" + e.getID() + " name: " + e.getName() + " salary:" + e.getSalary() + " address:" + e.getAddress()));
    }

    static List<Employee> printRecords(List<Employee> employeeCollection) {

        return employeeCollection.stream()
                .sorted((employee1, employee2) -> employee1.getID().compareTo(employee2.getID()))
                .map(e -> new Employee(e.getID(), e.getName(), e.getSalary(), e.getAddress()))
                .collect(Collectors.toList());
    }

    public static List<Employee> getEmployeeRecords() {


        Employee Employee1 = Employee.builder()
                .ID("123AB")
                .address("Bangalore")
                .name("Naraismha Datta")
                .salary(50000)
                .build();
        Employee Employee2 = Employee.builder()
                .ID("345AB")
                .address("Bangalore")
                .name("Nitin")
                .salary(50000)
                .build();
        Employee Employee3 = Employee.builder()
                .ID("567AB")
                .address("Bangalore")
                .name("Akhil")
                .salary(50000)
                .build();

        Employee Employee4 = Employee.builder()
                .ID("001AB")
                .address("Bangalore")
                .name("Manoj")
                .salary(50000)
                .build();

        List<Employee> EmployeeData = new ArrayList<>();
        EmployeeData.add(Employee1);
        EmployeeData.add(Employee2);
        EmployeeData.add(Employee3);
        EmployeeData.add(Employee4);
        return EmployeeData;
    }
}
