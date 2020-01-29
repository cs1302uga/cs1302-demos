package cs1302.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * A basic program to test exception handling.
 */
public class FileNotFound {

    /** User input scanner. */
    public static final Scanner INPUT = new Scanner(System.in);

    /**
     * Returns the number of white-space deliminited tokens in
     *  the file given by {@code path}.
     * @param path the path to the file.
     * @throws FileNotFoundException when the file is not accessible or cannot be found
     * @throws NullPointerException when {@code path} is {@code null}
     * @return the number of lines in the file.
     */
    public static long countTokens(String path) throws FileNotFoundException {
        long count = 0;
        File file = new File(path);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            count += 1;
            fileScanner.next();
        } // while
        return count;
    } // countTokens

    /**
     * Prompts the user for a single line of input.
     * @param message a prompt string
     * @return a single line of user input
     */
    public static String promptLine(String message) {
        System.out.print(message);
        return INPUT.nextLine();
    } // promptLine

    public static void main(String[] args) {

        String filename = promptLine("Enter a file path: ");

        // treat - as null for illustrative purposes
        if (filename.equals("-")) {
            filename = null;
        } //if

        boolean okay = false;
        while (!okay) {
            try {
                long numTokens = countTokens(filename);
                System.out.println(numTokens);
                okay = true;
            } catch (FileNotFoundException fnfe) {
                System.err.printf("File Error: %s\n", fnfe.getMessage());
            } catch (NullPointerException npe) {
                System.err.println("Program does not support \"-\" or null values.");
            } finally {
                if (!okay) {
                    filename = promptLine("Re-enter a file path: ");
                } // if
            } // try
        } // while

    } // main

} // FileNotFound
