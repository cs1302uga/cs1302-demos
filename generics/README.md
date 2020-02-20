**Demo notes for Generics Demo**

1. Create generic driver from `ObjectContainer` making sure to leave
   the `next` instance variable as a raw type. This whole process
   shouldn't be much more than a few replace string commands.

1. Write the method below and ask them what's wrong with it. Discuss
   raw types and the idea that the call to `set` is risky.

   ```java
   public static void foo(Container rawContainer) {
      rawContainer.set("Hello");
   } // foo
   ```

1. Declare a `Container<String>` object and assign a proper reference.
   Call get and ask them what type it returns. Is it legal to assign
   the return value to a `String` variable? Explain the implicit
   type cast that occurs.

   ```java
   Container<String> strCont = new Container<String>("A");
   String str = strCont.get(); // What is the type of get?
   System.out.println(strCont.get());
   ```

1. Declare a raw type `Container` and assign it the `strCont` reference
   created in the previous step. Also, run the get method and ask
   what it returns. Here, we need a cast. Explain why.

   ```java
   Container raw = strCont;
   str = raw.get();
   System.out.println(raw.get());
   ```

1. Ask what they expect from the following two lines of code below.
   It compiles but throws a `ClassCastException` on the second line
   when it implicitly casts the `Double` value to a `String`.

   ```java
   raw.set(new Double(7.0));
   System.out.println(strCont.get());
   ```

1. Ask what they expect from the following two lines. This won't
   compile because `Container<Object>` is not a parent of
   `Container<String>`.

   ```java
   Container<Object> objCont;
   objCont = new Container<String>("B");
   ```

1. Add the line below to the code. Now, we will see the problem
   with leaving out the type parameter in the `next` reference
   in `Container`. Ask if the code will compile. It won't because
   we need a typecast. This will confuse them as `stringHead` is
   a `Container<String>`. Explain that the `get` method returns
   `Object`.

   ```java
   Container<String> stringHead = createStringList();

   String lastString = stringHead.getNext()
       .getNext()
       .getNext()
       .get();

   System.out.println(lastString);
   ```

1. If we don't fix the `Container` class, we can add a container
   with any type argument as the raw type is the parent to all of
   the parameterized type. So, the following would compile but not
   run:

   ```java
   stringHead.setNext(new Container<Double>(4.0));

   System.out.println(stringHead.get());
   System.out.println((Double)stringHead.getNext().get());
   System.out.println((String)stringHead.getNext().get());
   ```

1. Fix the `Container` class and show how the above will not compile
   with the fix as all nodes have to be `Container<String>`.