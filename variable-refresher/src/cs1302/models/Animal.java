package cs1302.models;

/**
 * A basic class representing animals. Each {@code Animal} object
 * has an {@code age} and methods to set and retrieve the age.
 */
public abstract class Animal implements Printable {

    private int age;

    /**
     * Returns the animal's age, in years.
     * @return an {@code int} value
     */
    public int getAge() {
        return age;
    } // getAge

    /**
     * Sets the animal's age, in years.
     * @param age age, in years
     */
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negative: " + age);
        } // if
        this.age = age;
    } // setAge

} // Animal
