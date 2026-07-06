package src.test;

import src.employees.Employee;
import src.employees.Librarian;
import src.employees.Manager;
import src.employees.Reportable;

public class SystemTest {
    static void main(String[] args) {
        Employee manager = new Manager("Fernando", 6000.0);
        Employee librarian = new Librarian("Luzia", 4000.0);

        //Interface's application
        Reportable managerReport = new Manager("Fernando", 6000.0);

        manager.showInfo();
        System.out.println(managerReport.generateReport());
        librarian.showInfo();
    }
}
