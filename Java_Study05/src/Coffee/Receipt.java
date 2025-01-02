package Coffee;

public class Receipt {
    private String orderNumber;
    private int total;

    public Receipt(String orderNumber, int total) {
        this.orderNumber = orderNumber;
        this.total = total;
    }

    // Getter
    public String getName() {
        return orderNumber;
    }

    public int getPrice() {
        return total;
    }
}
