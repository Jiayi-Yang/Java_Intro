package algorithm.lambda;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaComparator {

    public static void main(String[] args) {
        Employee e1 = new Employee(10,"Mikey",25,'M',10000);
        Employee e2 = new Employee(20,"Arun",29,'F', 20000);
        Employee e3 = new Employee(10,"Lisa",35,'F',5000);
        Employee e4 = new Employee(1,"Pankaj",32,'M',50000);

        Employee[] empArr = new Employee[4];
        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;
        empArr[3] = e4;

        // Lambda function with Comparator
        Comparator<Employee> salaryComparator = (x, y) -> (int)(x.getSalary() - y.getSalary());
        Arrays.sort(empArr, salaryComparator);
        System.out.println(Arrays.toString(empArr));

        // forEach example
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.forEach((String str) -> System.out.println(str));

        // filter and map example
        List<String> result = new ArrayList<>();
        for (Employee employee : empArr) {
            if(employee.age<30){
                result.add(employee.name);
            }
        }
        System.out.println(result);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        List<Employee> ageFiltered = employees.stream().filter(e -> e.getAge()<30).collect(Collectors.toList());
        List<Integer> ages = employees.stream().map(e -> e.getAge()).collect(Collectors.toList());

        // method reference
        List<Integer> ages2 = employees.stream().map(Employee::getAge).collect(Collectors.toList());

        String joinedString = employees.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(","));
        System.out.println(joinedString);

        // groupby
        Map<Character, List<Employee>> bygender =
                employees.stream().collect(Collectors.groupingBy(Employee::getGender));
    }
}
