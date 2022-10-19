import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tyland", 
        List.of("I", "moved", "here", "recently", "too"));
        

        BookPrinter bookPrinter = new BookPrinter(book);

        BookPublisher publisher = new BookPublisher(bookPrinter);
        publisher.printToFile();

        BookReader reader = new BookReader(bookPrinter);
        reader.printToScreen();
    }
}