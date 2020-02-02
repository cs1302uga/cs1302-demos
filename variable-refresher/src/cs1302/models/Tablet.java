package cs1302.models;

/**
 * A class representing electronic tablets. Each {@code Tablet} object
 * has an associated {@code resolution}.
 */
public class Tablet extends Product {

    private int resolution;

    /**
     * Constructs a new {@code Tablet}.
     * @param id product identifier
     * @param resolution pixel resolution
     */
    public Tablet(long id, int resolution) {
        super(id);
        this.resolution = resolution;
    } // Tablet

    /** {@inheritDoc} */
    public void print() {
        super.print();
        System.out.printf("Resolution: %dp\n", resolution);
    } // print

} // Tablet
