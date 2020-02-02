# Variable Refresher Demo

1. Show the `variable-refresher-uml.png` UML diagram. Ask a few questions about it:
   1. Which classes are abstract?
   1. Does `Animal` inherit the `print` method? 
   1. What can you say about the `print` method in the `Product` class?
   1. How many instance variables are contained within `Kangaroo`? How many of them are directly accessible?
   1. Ask the previous question for `Book` and `Product`.
   
   
1. Create a driver program in the same package or in the `cs1302` package. We don't have protected variables so it doesn't matter. 
   1. `Printable p = new Kangaroo("Joey", 23.2, 14);`
      1. Ask if the line of code will compile.
      1. Draw out the diagram with the reference and the object. Write the types.
      1. Ask: What methods can we call using reference `p`. Have them explain. Then, ask what will be printed since the `print`
         method is abstract in `Printable`. Hopefully, they point out that the code from `Kangaroo`runs.
      1. Remind them: the reference determines what you can do. The object determines how it is done.
   1. `Animal a = new Animal(20);`
      1. Doesn't compile - abstract.
   1. `Tablet t = new Product(10987);`
      1. Doesn't compile. `Tablet` is a subclass of `Product`.
   1. `Product p = new Product(10987);`
      1. Doesn't compile as `Product` is abstract.
      1. Point out that `Product` has a constructor even though it is abstract.` May mention that it is called from `Tablet` and `Book`.
   1. 

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
