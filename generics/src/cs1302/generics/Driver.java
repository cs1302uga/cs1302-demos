package cs1302.generics;

/**
 * Driver program for cs1302 generics class demo using various types of
 * container objects.
 *
 * @author Brad Barnes and Supa' Mike
 * @version 1.0
 */
public class Driver {

    /**
     * Creates objects for each type of container to check basic functionality.
     * @param args command line argument array.
     */
    public static void main(String[] args) {


    } // main

    /**
     * Returns the first {@code Container} reference in a list
     * of {@code Container} objects. The returned list is made
     * up of four {@code Container} objects, each containing
     * a single {@code String}.
     *
     * @return a reference to the head of the {@code Container}
     * list.
     */
    private static Container<String> createStringList() {
        Container<String> oc = new Container<String>("Mike");
        oc = new Container<String>("Steve", oc);
        oc = new Container<String>("Linda", oc);
        oc = new Container<String>("Barbara", oc);
        return oc;
    } // createStringList

} // Driver
