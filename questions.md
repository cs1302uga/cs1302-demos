# Generics Demo Questions

## Getting Started

1. Use the following command to download and execute a shell script that retrieves 
   the starter code for this tutorial and places it into a subdirectory 
   called `cs1302-demos-generics`:

   ```
   $ curl -s -L https://git.io/Jv0QP | bash
   ```

## Questions / Steps

1. Inspect `compile.sh`, then run it.
   * What does the `-ex` at the top of the file mean?
   * What files does it compile? To where?
   * Does it run `checkstyle`?
   * Does it execute a driver program?
   
1. Create and compile a `Container` class in `src/cs1302/generics/Container.java`. 
   You will need to add it to the script. If you want to cheat, then see 
   [`Container.java`](src/cs1302/generics/Container.java) for hints.
   
1. To illustrate some potential warnings, try the scenarios below. For each
   scenario, do a guess-check-why. Be sure to write down the warnings when they
   occur. **If the compiler suggests that you recompile with `-Xlint:unchecked`,
   then you should add that to `compile.sh` to see the extra output.**
   * Add `<T>` on the constructor names.
   * Make the `next` instance variable as a raw type.
   * Make the `getNext()` return type as a raw type. 

1. Update `src/cs1302/generics/Driver.java` using a fixed `Container` class
   (i.e., no raw types). You can check for raw types in addition to other warning
   by compiling with `-Xlint` instead of `-Xlint:unchecked`. 
   
1. Update `src/cs1302/generics/Driver.java` to include the following method:
   
   ```java
   /**
    * Foo the container.
    * @param rawContainer container to foo
    */
   public static void foo(Container rawContainer) {
      rawContainer.set("Hello");
   } // foo
   ```
   
   * What are some potential issue? Why is this risky?
   * Any compiler errors or warnings?
   * Write a code snippet in the `main` method that cause the compiler to emit a warning.

1. In the `main` method, include the snippet below. For each
   scenario below, do a guess-check-why. Be sure to write down the warnings
   and errors when they
   occur.

   ```java
   Container<String> strCont = new Container<String>("A");
   String str = strCont.get(); // What is the type of get?
   System.out.println(strCont.get());
   ```
   
   * What type does `get()` return? Call `get()` and assign it to a variable that matched
     the return type.
   * Is it valid syntax to assign the return value to a `String` variable?

1. In the `main` method, include the snippet below. For each
   scenario below, do a guess-check-why. Be sure to write down the warnings
   and errors when they
   occur.

   ```java
   Container raw = strCont;
   str = raw.get();
   System.out.println(raw.get());
   ```
   
   * Dow we need a cast? Why or why not? 
   * Draw an object diagram (similar to our node pictures) for `raw`, `strCont`, and the object.
     Label the types for all three.

1. In the `main` method, include the snippet below. For each
   scenario below, do a guess-check-why. Be sure to write down the warnings 
   and errors when they
   occur.

   ```java
   raw.set(new Double(7.0));
   System.out.println(strCont.get());
   ```
   
   * Any warnings? Why or why not?
   * Any compiler errors? Why or why not?
   * Any exceptions? Why or why not?
   
   Comment out the code snippet before proceeding. 

1. In the `main` method, include the snippet below. For each
   scenario below, do a guess-check-why. Be sure to write down the warnings
   and errors when they
   occur.

   ```java
   Container<Object> objCont;
   objCont = new Container<String>("B");
   ```
   
   * Any warnings? Why or why not?
   * Any compiler errors? Why or why not?
   * Any exceptions? Why or why not?
   
   Comment out the code snippet before proceeding. 

1. Update `src/cs1302/generics/Container.java` an intentionally change the return type
   of the `getNext` method to be a raw type. In the `main` method, include the snippet below. 
   For each scenario below, do a guess-check-why. Be sure to write down the warnings
   and errors when they
   occur.

   ```java
   Container<String> stringHead = createStringList();

   String lastString = stringHead.getNext()
       .getNext()
       .getNext()
       .get();

   System.out.println(lastString);
   ```
   
   * Any warnings? Why or why not?
   * Any compiler errors? Why or why not?
   * Any exceptions? Why or why not?
   
   Comment out the code snippet in `main` before proceeding; however,
   keep the raw type change `src/cs1302/generics/Container.java`.

1. If we don't fix the `Container` class, we can add a container
   with any type argument as the raw type is the parent to all of
   the parameterized types. In the `main` method, include the snippet below. 
   For each scenario below, do a guess-check-why. 
   Be sure to write down the warnings and errors when they
   occur.

   ```java
   stringHead.setNext(new Container<Double>(4.0));

   System.out.println(stringHead.get());
   System.out.println((Double)stringHead.getNext().get());
   System.out.println((String)stringHead.getNext().get());
   ```
   
   * Any warnings? Why or why not?
   * Any compiler errors? Why or why not?
   * Any exceptions? Why or why not?

1. Fix the `Container` class, recompile everything, and run the driver (use the script).

   * Any warnings? Why or why not?
   * Any compiler errors? Why or why not?
   * Any exceptions? Why or why not?

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
