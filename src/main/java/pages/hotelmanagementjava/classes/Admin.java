package pages.hotelmanagementjava.classes;

/**
 * The Admin class represents an administrator user in the system.
 * <p>
 * <b>OOP Principle - Inheritance:</b>
 * This class {@code extends Person}, meaning it inherits all the attributes (firstName, lastName, etc.)
 * and behaviors (getters/setters) of the Person class. It then adds specialized properties
 * specifically needed for admins, such as {@code username} and {@code password}.
 * </p>
 */
public class Admin extends Person {
    private String username;
    private String password;

    /**
     * Constructs a new Admin object.
     * <p>
     * <b>OOP Principle - Polymorphism & Constructor Chaining:</b>
     * The {@code super()} keyword is used to invoke the constructor of the parent class (Person)
     * to initialize inherited properties before initializing its own fields.
     * </p>
     */
    public Admin(String firstName, String lastName, String phoneNumber, String email,
                 String username, String password) {
        super(firstName, lastName, phoneNumber, email);
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
