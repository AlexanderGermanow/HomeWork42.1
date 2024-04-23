package pizza.domain;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String phone;
    private static int idCounter = 0;

    public Customer(int id, String name, String address, String phone) {
        this.id = ++idCounter;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
