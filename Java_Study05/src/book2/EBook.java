package book2;

public class EBook extends Book{
	private double fileSize;
    private String downloadLink;
    
    public EBook(String title, String author, String ISBN, double price, int page, double fileSize, String downloadLink) {
    	super(title, author, ISBN, price,page);
        this.fileSize = fileSize;
        this.downloadLink = downloadLink;
    }
    
    public double getFileSize() { return fileSize; }
    public String getDownloadLink() { return downloadLink; }
    
    public void setfileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }


    @Override
    public void printInfo() {
        System.out.println("E-Book: " + getTitle() + " by " + getAuthor());
        System.out.println("ISBN: " + getISBN() + ", Price: " + getPrice());
        System.out.println("File Size: " + fileSize + " MB, Download: " + downloadLink);
    }
}
