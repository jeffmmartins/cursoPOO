package entities;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Serve para comparar um objeto com outro;
    // exemplo: comparar um funcionário com outro pelo nome para fazer a ordenação;
    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
