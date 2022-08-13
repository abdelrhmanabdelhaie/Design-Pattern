package SOLIDPrinciples.OCP;


public abstract class Employee {
    private String name;
    private String email;
    private String phone;

    public Employee(String name,String email,String phone){
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public abstract double calculateSalary(double baseSalary);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
