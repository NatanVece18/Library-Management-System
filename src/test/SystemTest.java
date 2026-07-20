package src.test;

import src.employees.Employee;
import src.employees.Librarian;
import src.employees.Manager;
import src.employees.Reportable;
import java.math.BigDecimal;

public class SystemTest{
    public static void main(String[] args) {
        Employee manager = new Manager("Fernando", new BigDecimal("6000.0"));
        Employee librarian = new Librarian("Luzia", new BigDecimal("4000.0"));

        //Interface's application
        Reportable managerReport = new Manager("Fernando", new BigDecimal("6000.0"));

        manager.showInfo();
        System.out.println(managerReport.generateReport());
        librarian.showInfo();
    }
}
