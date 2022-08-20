package creationalDP.prototype;

public class SuperEmployee extends EmployeePrototype{


    //Shallow == Read-Only
    @Override
    public EmployeePrototype shallowCopy() {
        return this;
    }

    //Deep == Read-and-Write
    @Override
    public EmployeePrototype deepCopy() {
        SuperEmployee superEmployee=new SuperEmployee();
        superEmployee.setId(this.getId());
        superEmployee.setName(this.getName());
        Address address =new Address();
        address.setCountry(this.getAddress().getCountry());
        address.setCity(this.getAddress().getCity());
        address.setStreet(this.getAddress().getStreet());
        superEmployee.setAddress(address);
        return superEmployee;
    }
}
