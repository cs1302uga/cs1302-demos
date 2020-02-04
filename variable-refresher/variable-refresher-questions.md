# Variable Refresher Demo Questions

1. Look at the UML diagram:
   1. Which classes are abstract?
   1. Does `Animal` inherit the `print` method? 
   1. What can you say about the `print` method in the `Product` class?
   1. How many instance variables are contained within `Kangaroo`? 
      1. How many of them are directly accessible inside the `Kangaroo` class itself?
      1. How many of them are directly accessible outside the `Kangaroo` class?
   1. Ask the previous question for `Book` and `Product`.
   
1. Create a driver program in the same package or in the `cs1302` package. 
   Test the lines below. **For each question, you should do a "guess, check, why?"**
   1. `Printable p = new Kangaroo("Joey", 23.2, 14);`
      1. Will it compile?
      1. Draw out the diagram with the reference and the object. Write the types.
      1. What methods can we call using reference `p`?
      1. If we call `p.print`, what will be printed since the `print` method is abstract in `Printable`. 
   1. `Animal a = new Animal(20);`
      1. Does it compile?
   1. `Animal a = new Tablet(1400, 5000);`
      1. Does it compile?
   1. `Animal a = new Kangaroo("Joey", 72.1, 8);`
      1. Does it compile?
      1. How many instance variables does the object have?
      1. What methods can we call using `a`?
   1. `Tablet t = new Product(10987);`
      1. Does it compile?
   1. `Product p = new Product(10987);`
      1. Does it compile?
      1. How is the `Product` constructor used if the class is abstract?
   1. Create an array of type `Printable` of size 5. 
      1. Draw the array of `Printabl` references.
      1. What is the initial value of each array element?
      1. Write code to populate the array with various object references.
      1. Write a for-each loop to call the `print` method on each object.
   1. Write a method that returns a `Printable` reference.
      1. What object references can you return from this method?
      1. What we can do with the return value from the calling method?

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
