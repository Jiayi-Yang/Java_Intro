package algorithm.lambda;

public class Employee {
    long id;
    String name;
    int age;
    char gender;
    int salary;
    Employee(long id, String name,int ageNumber, char gender, int salaryNumber){
        this.id = id;
        this.name = name;
        this.age = ageNumber;
        this.gender = gender;
        this.salary = salaryNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
