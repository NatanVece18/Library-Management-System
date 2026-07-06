package src.employees;

public class Manager extends Employee
        implements Reportable{

    public Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public double calculateBonus(){
        return getSalary() * 0.4;
    }

    @Override
    public String toString() {
        double bonus = calculateBonus();
        String report = generateReport();
        return "Manager{" +
                "\nname: " + getName() +
                "\nsalary: " + getSalary() +
                "\nbonus: " + bonus +
                "\ntotal salary: " + (getSalary() + bonus) +
                "\n}";
    }

    @Override
    public void showInfo(){
        System.out.println("=============");
        System.out.println(toString());
        System.out.println("=============");
    }

    @Override
    public String generateReport() {
        return "Manager is able to generate reports!!!";
    }
}
