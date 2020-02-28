package cs1302.lambdas;

import java.util.Arrays;
import cs1302.Utility;

/**
 * Driver class for class demo on lambdas.
 */
public class Driver {

    public static void main(String[] args) {

        // SOME OBJECTS FOR TESTING

        Shape[] shapes = new Shape[] {
            new Circle(2.0),
            new Ellipse(3.2, 2.8),
            new Rectangle(Math.PI, 4.0)
        };

        Circle c1 = new Circle(4.5);
        Circle c2 = new Circle(1.0);
        Circle c3 = new Circle(2.3);

        Square s1 = new Square(2.0);
        Rectangle r1 = new Rectangle(1.0, 4.0);
        Rectangle r2 = new Rectangle(2.0, 1.0);

        // YOUR CODE DOWN HERE

    } // main

} // Driver
