public class BookReader implements IBookScreenPrinter {
    private BookPrinter adaptee;

    public BookReader(BookPrinter adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void printToScreen() {
        adaptee.printToScreen();
    }
}
