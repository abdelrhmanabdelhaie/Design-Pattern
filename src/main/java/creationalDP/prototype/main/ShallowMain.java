package creationalDP.prototype.main;

import creationalDP.prototype.Address;
import creationalDP.prototype.EmployeePrototype;
import creationalDP.prototype.SuperEmployee;

//Shallow == Read-Only
public class ShallowMain {
    public static void main(String[] args) {
        EmployeePrototype initEmployee = new SuperEmployee();
        initEmployee.setId(10);
        initEmployee.setName("Abdelrahman");
        initEmployee.setAddress(new Address("Egy", "Cairo", "90South"));

        EmployeePrototype copyEmployee = initEmployee.shallowCopy();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Shallow Copy ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Shallow Copy Before Edit!!!!");
        System.out.println(initEmployee);
        System.out.println(copyEmployee);

        copyEmployee.setId(22);
        copyEmployee.setName("Mohamed");
        copyEmployee.getAddress().setCountry("Egypt");
        copyEmployee.getAddress().setCity("New Cairo");

        System.out.println("Shallow Copy After Edit!!!!");
        System.out.println(initEmployee);
        System.out.println(copyEmployee);


    }
}
