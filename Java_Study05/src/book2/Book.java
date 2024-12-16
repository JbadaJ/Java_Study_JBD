package book2;

public abstract class Book {
	private String title;
	private String author;
	private double price;
	private int page;
	private String ISBN;
	
	public Book(String title, String author, String ISBN, double price, int page) {	
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.price=price;
		this.page=page;
	}
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public double getPrice() { return price; }
    public int getPage() {return page;}
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    
    public abstract void printInfo();
}
