package pizza.domain;

public class ExitComponent {
    private int id;
    private String name;
    private int price;
    private static int idCounter = 0;

    public ExitComponent(String name, int price) {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void update(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ExitComponent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
