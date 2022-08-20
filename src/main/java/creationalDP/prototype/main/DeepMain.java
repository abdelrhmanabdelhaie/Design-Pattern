package creationalDP.prototype.main;

import creationalDP.prototype.Address;
import creationalDP.prototype.EmployeePrototype;
import creationalDP.prototype.SuperEmployee;

//Deep == Read-and-Write
public class DeepMain {
    public static void main(String[] args) {
        EmployeePrototype initEmployee = new SuperEmployee();
        initEmployee.setId(10);
        initEmployee.setName("Abdelrahman");
        initEmployee.setAddress(new Address("Egy", "Cairo", "90North"));

        EmployeePrototype copyEmployee = initEmployee.deepCopy();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Deep Copy ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Deep Copy Before Edit!!!!");
        System.out.println(initEmployee);
        System.out.println(copyEmployee);

        copyEmployee.setId(22);
        copyEmployee.setName("Mohamed");
        copyEmployee.getAddress().setCountry("Egypt");
        copyEmployee.getAddress().setCity("New Cairo");

        System.out.println("Deep Copy After Edit!!!!");
        System.out.println(initEmployee);
        System.out.println(copyEmployee);


    }
}
