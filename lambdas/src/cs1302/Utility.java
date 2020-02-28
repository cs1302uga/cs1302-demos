package cs1302;

/**
 * This class contains a utility methods for checking the validity of
 * input parameters.
 */
public class Utility {

    /**
     * Throws a {@code NullPointerException} if the value of any
     * references in {@code o} is {@code null}. The method performs no
     * actions if none of the references are {@code null}. If {@code T}
     * is explicitly parameterized at compile time, then the compiler will
     * also enforce a compile-time check that all references in {@code o}
     * are type {@code T}.
     *
     * @param <T> the types of the references to check
     * @param method the name of the calling method.
     * @param o parameter containing the object to verify.
     * @throws NullPointerException if parameter {@code o}
     * is {@code null}.
     */
    @SafeVarargs
    public static <T> void checkNull(String method, T ... o) {
        for (T obj : o) {
            if (obj == null) {
                String message = method + ": Null Argument Provided";
                throw new NullPointerException(message);
            } // if
        } // for
    } // checkNull

} // Utility
