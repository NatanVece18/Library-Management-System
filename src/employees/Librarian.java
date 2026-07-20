package src.employees;

import java.math.BigDecimal;

public class Librarian extends Employee{

    public Librarian(String name, BigDecimal salary){
        super(name, salary);
    }

    @Override
    public BigDecimal calculateBonus(){
        BigDecimal currentSalary = getSalary();
        BigDecimal bonusPercentage = new BigDecimal("0.1");
        return currentSalary.multiply(bonusPercentage);
    }
}
