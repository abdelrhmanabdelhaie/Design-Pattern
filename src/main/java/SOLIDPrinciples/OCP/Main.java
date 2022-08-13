package SOLIDPrinciples.OCP;

public class Main {

    public static void main(String[] args) {
        Employee manager=new Employee("Abdelrahman","abdo@gmail","010"){
            @Override
            public double calculateSalary(double baseSalary) {
                return baseSalary*10;
            }
        };

       double managerSalary= manager.calculateSalary(100);
        System.out.println(manager +" / "+managerSalary);

        Employee employee=new Employee("Abdelrahman","abdo@gmail","010"){
            @Override
            public double calculateSalary(double baseSalary) {
                return baseSalary*5;
            }
        };
        double employeeSalary= employee.calculateSalary(100);
        System.out.println(employee +" / "+employeeSalary);
    }
}
