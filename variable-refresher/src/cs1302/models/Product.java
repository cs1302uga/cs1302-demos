package cs1302.models;

/**
 * A basic class representing a product. Each {@code Product} object
 * has an ID number and methods to modify and retrieve the ID.
 *
 * @author <a href="mailto:mec@nike.cs.uga.edu">Michael Cotterell</a>
 * @version 1.0
 */
public abstract class Product implements Printable {

    private long id;

    /**
     * Constructs a new {@code Product}.
     * @param id product identifier
     */
    public Product(long id) {
        this.id = id;
    } // Product

    /**
     * Returns the identifier for this product.
     * @return identifier for this product.
     */
    public long getId() {
        return id;
    } // getId

    /** {@inheritDoc} */
    public void print() {
        System.out.println("Product");
        System.out.println("ID: " + id);
    } // print

} // Product
