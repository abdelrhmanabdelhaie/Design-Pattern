package creationalDP.prototype;

public class NormalEmployee extends EmployeePrototype {


    //Shallow == Read-Only
    @Override
    public EmployeePrototype shallowCopy() {
        return this;
    }

    //Deep == Read-and-Write
    @Override
    public EmployeePrototype deepCopy() {
        NormalEmployee normalEmployee = new NormalEmployee();
        normalEmployee.setId(this.getId());
        normalEmployee.setName(this.getName());
        Address address = new Address();
        address.setCountry(this.getAddress().getCountry());
        address.setCity(this.getAddress().getCity());
        address.setStreet(this.getAddress().getStreet());
        normalEmployee.setAddress(address);
        return normalEmployee;
    }
}
