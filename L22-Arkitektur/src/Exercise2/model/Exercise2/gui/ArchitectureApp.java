package Exercise2.model.Exercise2.gui;

import Exercise2.model.Exercise2.controller.Controller;
import Exercise2.model.Exercise2.model.Company;
import Exercise2.model.Exercise2.model.Customer;
import Exercise2.model.Exercise2.model.Employee;
import javafx.application.Application;

public class ArchitectureApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(ArchitectureGui.class);
    }

    public static void initStorage() {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Company sled = Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Employee bob = Controller.createEmployee("Bob Dole", 210, 2010);
        Controller.addEmployeeToCompany(bob, ibm);

        Employee alice = Controller.createEmployee("Alice Schmidt", 250, 2013);
        Controller.addEmployeeToCompany(alice, ibm);

        Employee george = Controller.createEmployee("George Down", 150, 1994);
        Controller.addEmployeeToCompany(george, amd);

        Employee rita = Controller.createEmployee("Rita Uphill", 300, 1999);
        Controller.addEmployeeToCompany(rita, sled);

        Controller.createEmployee("John Doe", 100, 2018);

        Customer Martin = Controller.createCustomer("Martin");
        Customer Hans = Controller.createCustomer("Hans");
        Customer Ole = Controller.createCustomer("Ole");
        Customer Christian = Controller.createCustomer("Christian");
        Customer Donald = Controller.createCustomer("Donald");
        Customer Erik = Controller.createCustomer("Erik");

        Controller.addCustomerToCompany(Martin, amd);
        Controller.addCustomerToCompany(Hans, ibm);
        Controller.addCustomerToCompany(Ole, sled);
        Controller.addCustomerToCompany(Christian, ibm);
        Controller.addCustomerToCompany(Donald, amd);
        Controller.addCustomerToCompany(Erik, sled);


    }
}
