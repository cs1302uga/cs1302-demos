1. Demo notes for `FileNotFound.java`:
   1. Fill in `countTokens` method as a group. Emphasize the possible exceptions (`NullPointerException` and `FileNotFoundException`).
      Mention that one is checked and the other unchecked.
   1. Use empty catch statement for `FileNotFoundException` - show that the method returns 0 lines.
   1. Add print statement (`System.out.println(fnfe)`) to catch and demo the difference between this
      and an empty catch. Use `System.exit(1)` to end program. `echo #?` to show the exit status from console.
      Here, it doesn't really make sense to let the user try the input again. We don't know if the
      filename came from stdin.
   1. Pass in "-" as a parameter so the method receives null. This causes a `NullPointerException`
      (unchecked) in the `File` constructor. 
   1. Move file constructor into try block and talk about handling both exceptions using the general
      Exception class and why we wouldn't want to do it.
   1. Handle both exceptions separately from within the method. Have the program exit with `System.exit(2)` for
      the `NullPointerException` to show that its best to handle various exceptions in different ways.
   1. Ask if it is appropriate to handle the exceptions inside the method. Get the class to understand
      that it is better in this case to propagate.
   1. Move exception handling to main - add throws to method signature and javadoc.
   1. With the new structure, it makes sense to let user try again so add a loop to give another
      input chance.
   1. Discuss how we might identify invalid arguments and explicitly throw an
      `IllegalArgumentException` from within the method. We used the example that the filename
      should not end in `.class`.
