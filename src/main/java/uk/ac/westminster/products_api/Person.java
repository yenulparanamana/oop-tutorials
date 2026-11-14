
package uk.ac.westminster.products_api;

public class Person {

    // Fields
    private String name;
    private String email;

    // Default constructor
    public Person() {
    }

    // Constructor with name
    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }
}
