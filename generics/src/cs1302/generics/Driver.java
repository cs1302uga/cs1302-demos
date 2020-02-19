package cs1302.generics;

/**
 * Driver program for cs1302 class exercise 13 using various types of
 * container objects.
 *
 * @author Brad Barnes and Supa' Mike
 * @version 1.0
 */

public class Driver {

    public static void foo(Container rawContainer) {
        rawContainer.set("Hello"); // risky! What type of contents are in the container?
    } // foo

    /**
     * Creates objects for each type of container to check basic functionality.
     * @param args command line argument array.
     */
    public static void main(String[] args) {
        Container<String> strCont = new Container<String>("A");
        Container raw = strCont; // 1

        String str = strCont.get(); // What is the type of get?
        System.out.println(strCont.get());

        str = (String)raw.get(); // 2
        System.out.println(raw.get());

        //raw.set(new Double(7.0)); // 3
        //System.out.println(strCont.get());

        //Container<Object> objCont;
        //objCont = new Container<String>("B");

        Container<String> stringHead = createStringList();

        String lastString = (String) stringHead.getNext()
            .getNext()
            .getNext()
            .get();

        stringHead.setNext(new Container<Double>(4.0));

        System.out.println(stringHead.get());
        System.out.println((Double)stringHead.getNext().get());
        System.out.println((String)stringHead.getNext().get());

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
