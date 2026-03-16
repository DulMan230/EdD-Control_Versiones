public class LibraryTest {

    public void testAddDuplicateBook() {
        Library library = new Library();

        Book book1 = new Book("Test Book 1", "Author 1", "ISBN-123");
        Book book2 = new Book("Test Book 2", "Author 2", "ISBN-123");

        library.addBook(book1);
        library.addBook(book2);
    }
    public void testSearchBookCaseInsensitive() {
    Library library = new Library();

    Book book = new Book("Harry Potter", "Rowling", "ISBN-001");

    library.addBook(book);
    library.findBookByTitle("harry potter");
}
}