package creationalDP.prototype;

public abstract class EmployeePrototype {

    private int id;
    private String name;
    private Address address;


    public abstract EmployeePrototype shallowCopy();

    public abstract EmployeePrototype deepCopy();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeePrototype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
