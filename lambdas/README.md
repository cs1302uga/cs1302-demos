# Lambda Expressions Demo

## Notes

1. Use the following command to download and execute a shell script that retrieves
   the starter code for this tutorial and places it into a subdirectory
   called `cs1302-demos-lambdas`:

   ```
   ** NEED NEW LINK**
   $ curl -s -L https://git.io/Jv0QP | bash
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
   
1. 

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
