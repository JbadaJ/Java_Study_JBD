package book;

public class MainTest {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        
        EBook ebook = new EBook("Java Programming", "John Doe", "ISBN001", 29.99, 5.2, "http://example.com/download");
        PaperBook pbook = new PaperBook("Data Structures", "Jane Doe", "ISBN002", 39.99, 10, "Tech Publisher");
        
        manager.addBook(ebook);
        manager.addBook(pbook);
        
        // 모든 책 출력
        manager.printAllBooks();
        
        // 검색 기능
        Book found = manager.findBookByTitle("Java Programming");
        if (found != null) {
            System.out.println("Found book:");
            found.printInfo();
        }
        
        // 삭제 기능
        manager.removeBookByISBN("ISBN001");
        
        System.out.println("After removal:");
        manager.printAllBooks();
    }
}
