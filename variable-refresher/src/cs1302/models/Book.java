package cs1302.models;

/**
 * A class representing books. Each {@code Book} object
 * has an associated {@code title}.
 */
public class Book extends Product {

    private String title;

    /**
     * Constructs a new {@code Book}.
     * @param id product identifier
     * @param title book title
     */
    public Book(long id, String title) {
        super(id);
        this.title = title;
    } // Tablet

    /** {@inheritDoc} */
    public void print() {
        super.print();
        System.out.printf("Title: %s\n", title);
    } // print

} // Book
