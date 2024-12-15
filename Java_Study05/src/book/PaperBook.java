package book;

public class PaperBook extends Book {
    private int stock;
    private String publisher;
    
    public PaperBook(String title, String author, String ISBN, double price, int stock, String publisher) {
        super(title, author, ISBN, price);
        this.stock = stock;
        this.publisher = publisher;
    }
    
    public int getStock() { return stock; }
    public void increaseStock(int amount) { stock += amount; }
    public void decreaseStock(int amount) { 
        if (stock - amount >= 0) stock -= amount; 
    }
    public String getPublisher() { return publisher; }
    
    @Override
    public void printInfo() {
        System.out.println("Paper Book: " + getTitle() + " by " + getAuthor());
        System.out.println("ISBN: " + getISBN() + ", Price: " + getPrice());
        System.out.println("Publisher: " + publisher + ", Stock: " + stock);
    }
}
