package pages.hotelmanagementjava.classes;

/**
 * The Person class serves as the base class (Superclass) for all human entities in the system.
 * <p>
 * <b>OOP Principle - Abstraction & Inheritance:</b>
 * This class abstracts the common properties of a person (like name and contact info)
 * so that specialized classes (like Admin and Guest) can inherit them without code duplication.
 * </p>
 * <p>
 * <b>OOP Principle - Encapsulation:</b>
 * All member variables are marked as {@code private} to prevent unauthorized direct access.
 * Access is safely managed via public getter and setter methods.
 * </p>
 */
public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    /**
     * Parameterized constructor used to initialize the state of a Person object.
     * 
     * @param firstName   The first name of the person.
     * @param lastName    The last name of the person.
     * @param phoneNumber The contact phone number.
     * @param email       The email address.
     */
    public Person(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

