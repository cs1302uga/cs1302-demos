package cs1302.lambdas;

import java.util.Arrays;
import cs1302.Utility;
import cs1302.util.ArrayUtility;

/**
 * Driver class for class demo on lambdas.
 */
public class Driver {

    public static void main(String[] args) {

        String[] strings = new String[] {
            "bb",
            "aa",
            "dd",
            "cc"
        };

        Circle[] circles = new Circle[] {
            new Circle(5.0),
            new Circle(3.3),
            new Circle(4.1),
            new Circle(1.2)
        };

        // YOUR CODE DOWN HERE

    } // main

    /**
     * Prints each element of the specified array by implicitly
     * calling the element's {@code toString} method. One
     * element is printed per line of output.
     *
     * @param <T> the type of the objects to be printed.
     * @param array the array to be printed.
     */
    public static <T> void printArray(T[] array) {
        for (T val: array) {
            System.out.println(val);
        } // for
    } // printArray
} // Driver
