# ProblemSolving
Problem solving using java language
import java.util.*;

class Employee {
    private String name;
    private String position;
    private long salary;

    public Employee(String name, String position, long salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            if (this == o)
                return true;
            Employee that = (Employee) o;
            return this.name.equals(that.name) &&
                    this.position.equals(that.position) &&
                    this.salary == that.salary;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Rabbani {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        try(Scanner sc = new Scanner(System.in)) {
            String s;
            while (!(s = sc.nextLine()).isEmpty()) {
                String[] data = s.split("\\s+");
                Employee employee = new Employee(data[0], data[1], Long.parseLong(data[2]));
                if (!employees.contains(employee)) {
                    employees.add(employee);
                } else {
                    System.out.printf("Duplicate data found... %s\n", employee);
                }
            }
        }
        System.out.println(employees);
    }
}
