package src.employees;

import java.math.BigDecimal;

public class Manager extends Employee
        implements Reportable{

    public Manager(String name, BigDecimal salary){
        super(name, salary);
    }

    @Override
    public BigDecimal calculateBonus(){
        BigDecimal currentSalary = getSalary();
        BigDecimal bonusPercentage = new BigDecimal("0.4");
        return currentSalary.multiply(bonusPercentage);
    }

    @Override
    public String generateReport() {
        return "Manager is able to generate reports!!!";
    }
}
