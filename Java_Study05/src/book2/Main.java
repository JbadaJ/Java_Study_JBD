package book2;

import book2.Book;
import book2.Manager;
import book2.EBook;
import book2.PaperBook;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        
        EBook ebook = new EBook("Java Programming", "John Doe", "ISBN001", 29.99, 100, 5.2, "http://example.com/download");
        
        manager.addBook(ebook);
        
        // 모든 책 출력
        manager.printAllBooks();
        
        ebook.setTitle("Title Changed");
        
        manager.printAllBooks();
    }
}
