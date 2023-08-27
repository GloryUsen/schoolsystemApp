package Entity;

import javax.management.relation.Role;

public class Person {

    protected String firstName;
    protected String lastName;
    protected String email;

    protected Role role;

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
