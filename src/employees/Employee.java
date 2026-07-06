package src.employees;

public abstract class Employee {
    private final int id;
    private String name;
    private double salary;
    private static int nextId = 1;

    public Employee(String name, double salary){
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public abstract void showInfo();

    public int getId() {
        return id;
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
}
