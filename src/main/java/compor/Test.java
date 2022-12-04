package compor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emh1 = new Employee(5, "Ivan", "Zvanov", 50);
        Employee emh2 = new Employee(4, "Andrey", "Vano", 48);
        Employee emh3 = new Employee(8, "Ivan", "Ivanov", 70);
        employeeList.add(emh1);
        employeeList.add(emh2);
        employeeList.add(emh3);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);


    }
}
class Employee  implements  Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        //return this.id-o.id;
        int i = this.name.compareTo(o.name);
        if (i==0) {
            i = this.surname.compareTo(o.surname);
        }
        return i;



    }
}
