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
     * Returns the first {@code ObjectContainer} reference in a list
     * of {@code ObjectContainer} objects. The returned list is made
     * up of four {@code ObjectContainer} objects, each containing
     * a single {@code String}.
     *
     * @return a reference to the head of the {@code ObjectContainer}
     * list.
     */
    private static ObjectContainer createStringList() {
        ObjectContainer oc = new ObjectContainer("Mike");
        oc = new ObjectContainer("Steve", oc);
        oc = new ObjectContainer("Linda", oc);
        oc = new ObjectContainer("Barbara", oc);
        return oc;
    } // createStringList

} // Driver
