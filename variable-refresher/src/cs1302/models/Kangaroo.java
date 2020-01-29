package cs1302.models;

/**
 * Describe class {@code Kangaroo} here.
 */
public class Kangaroo extends Animal {

    private double pouchSize; // in square centimeters
    private String name;

    /**
     * Constructs a new {@code Kangaroo}.
     * @param name name this kangaroo is known by
     * @param pouchSize size of the pouch, in square centimeters
     * @param age kangaroo's age, in years
     */
    public Kangaroo(String name, double pouchSize, int age) {
        setAge(age);
        this.name = name;
        this.pouchSize = pouchSize;
    } // Kangaroo

    /**
     * Returns the size of the pouch, in square centimeters.
     * @return size of the pouch, in square centimeters
     */
    public double getPouchSize() {
        return pouchSize;
    } // getPouchSize

    /**
     * Returns the name of this kangaroo.
     * @return name of this kangaroo
     */
    public String getName() {
        return name;
    } // getName

    /** {@inheritDoc} */
    public void print() {
        System.out.printf("Kangaroo(name='%s', pouchSize=%.2f)\n", name, pouchSize);
    } // print

} // Kangaroo
