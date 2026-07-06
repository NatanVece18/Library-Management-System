package src.employees;

public class Librarian extends Employee{

    public Librarian(String name, double salary){
        super(name, salary);
    }

    @Override
    public double calculateBonus(){
        return getSalary() * 0.15;
    }

    @Override
    public String toString() {
        double bonus = calculateBonus();
        return "Librarian{" +
                "\nname: " + getName() +
                "\nsalary: " + getSalary() +
                "\nbonus: " + bonus +
                "   \ntotal salary: " + (getSalary() + bonus) +
                "\n}";
    }

    @Override
    public void showInfo(){
        System.out.println("=============");
        System.out.println(toString());
        System.out.println("=============");
    }
}
