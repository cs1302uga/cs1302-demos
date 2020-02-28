# Lambda Expressions Demo

## Notes

1. Use the following command to download and execute a shell script that retrieves
   the starter code for this tutorial and places it into a subdirectory
   called `cs1302-demos-lambdas`:

   ```
   $ curl -s -L https://git.io/JvzDb | bash
   ```

1. Discuss the objectives of the demo and compile the starter code with the script. This is a
   good opportunity to review scripting.
   
1. Pull up the [`ArrayUtility` API](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce15-api/cs1302/util/ArrayUtility.html)
   and briefly discuss the two method signatures. What can `T` be replaced with in each?
   
1. Show the `String` API. Point out that `String` implements `Comparable<String>`. Ask if we can call `sort` 
   on the `strings` array.

1. Open `Circle.java`. Point out that it implements `Comparable<Circle>`. Ask if we can call `sort` on the 
   `circles` array.
   
1. Point out the generic `printArray` method in the `Driver` class.

1. Write out the following code in `main` discussing each line as we go. Focus on the type argument and the call to
   a static method using the class name.

   ```java
   Driver.<String>printArray(strings);
   ArrayUtility.<String>sort(strings);
   Driver.<String>printArray(strings);

   Driver.<Circle>printArray(circles);
   ArrayUtility.<Circle>sort(circles);
   Driver.<Circle>printArray(circles);
   ```
   
1. Point out the weakness in this approach. Basically, if we want to change how these arrays are sorted, we need
   to modify the `compareTo` method inside of each class. That's possible, but likely not ideal, for `Circle`. For
   `String`, it isn't possible. We don't always have access to the source code but we may still want to change
   how objects are compared.
   
1. Create a `NameComparator` class and add it to the compile script. Code:

   ```java
   package cs1302.lambdas;

   import java.util.Comparator;

   /**
    * An implementation of Comparator that compares two {@code Circle}
    * objects by their names.
    */
   public class NameComparator implements Comparator<Circle> {

      @Override
      public int compare(Circle c1, Circle c2) {
         return c1.getName().compareTo(c2.getName());
      } // compare

   } // NameComparator
   ```

1. Call the second `sort` method by adding the following code to the `Driver`:

   ```java
   NameComparator n = new NameComparator();

   Driver.<Circle>printArray(circles);
   ArrayUtility.<Circle>sort(circles, n);
   Driver.<Circle>printArray(circles);
   ```

1. At this point, we may want to modify the `toString` method in `Circle` or adjust the `circles` array.
   The answer is the same whether you sort by radius, area, or name with the array we start with.
   
1. Discuss how using an anonymous class (below) is an alternative to the above:

   ```java
   Comparator<Circle> nameComp = new Comparator<Circle>() {
        @Override
        public int compare(Circle c1, Circle c2) {
            return c1.getName().compareTo(c2.getName());
        } // compare

   };
   Driver.<Circle>printArray(circles);
   ArrayUtility.<Circle>sort(circles, nameComp);
   Driver.<Circle>printArray(circles);
   ```
   
1. Discuss the parts of the above that can be removed. Show them that this leads to a lambda expression.

1. Give a few examples of lambdas. For example, sort the strings by length.

   Name comparator:   
   ```java
   Comparator<Circle> nameComp = (c1, c2) -> c1.getName().compareTo(c2.getName());
   ```
   
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
