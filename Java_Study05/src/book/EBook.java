package book;

public class EBook extends Book {
    private double fileSize;
    private String downloadLink;
    
    public EBook(String title, String author, String ISBN, double price, double fileSize, String downloadLink) {
        super(title, author, ISBN, price);
        this.fileSize = fileSize;
        this.downloadLink = downloadLink;
    }
    
    public double getFileSize() { return fileSize; }
    public String getDownloadLink() { return downloadLink; }
    
    @Override
    public void printInfo() {
        System.out.println("E-Book: " + getTitle() + " by " + getAuthor());
        System.out.println("ISBN: " + getISBN() + ", Price: " + getPrice());
        System.out.println("File Size: " + fileSize + " MB, Download: " + downloadLink);
    }
}
