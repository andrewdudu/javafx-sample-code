package sample;

public class Person {
    public String firstName;
    public String lastName;
    public String email;

    public Person(String fname, String lname, String email) {
        this.firstName = fname;
        this.lastName = lname;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
