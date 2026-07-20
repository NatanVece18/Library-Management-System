package src.employees;

import java.math.BigDecimal;

public abstract class Employee {
    private final int id;
    private String name;
    private BigDecimal salary;
    private static int nextId = 1;

    public Employee(String name, BigDecimal salary){
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
    }

    public abstract BigDecimal calculateBonus();

    @Override
    public String toString() {
        BigDecimal bonus = calculateBonus();
        BigDecimal totalSalary = salary.add(bonus);
        return  getClass().getSimpleName() + "{" +
                "\nid: " + getId() +
                "\nname: " + getName() +
                "\nsalary: " + getSalary() +
                "\nbonus: " + bonus +
                "\ntotal salary: " + totalSalary +
                "\n}";
    }

    public void showInfo(){
        System.out.println("=============");
        System.out.println(toString());
        System.out.println("=============");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary){
        this.salary = salary;
    }
}
