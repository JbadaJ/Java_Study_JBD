package Coffee;

public class Coffee {
    private String name;
    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
