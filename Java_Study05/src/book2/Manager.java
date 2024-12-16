package book2;

import java.util.ArrayList;
import java.util.List;

import book2.Book;

public class Manager {
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public boolean removeBookByISBN(String isbn) {
        return books.removeIf(b -> b.getISBN().equals(isbn));
    }
    
    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
    
    public Book findBookByISBN(String isbn) {
        for (Book b : books) {
            if (b.getISBN().equals(isbn)) {
                return b;
            }
        }
        return null;
    }
    
    public void printAllBooks() {
        for (Book b : books) {
            b.printInfo();
            System.out.println("---");
        }

}
}
