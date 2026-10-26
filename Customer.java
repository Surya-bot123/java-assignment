package assinemnt;

import java.util.Objects;

public class Customer implements Comparable<Customer> {

    private int id;
    private String firstName;
    private String lastName;
    private char gender;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nCustomer[id=" + id
                + ", firstname=" + firstName
                + ", lastname=" + lastName
                + ", gender=" + gender + "]";
    }

    @Override
    public int compareTo(Customer other) {
        return Integer.compare(other.id, this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Customer)) {
            return false;
        }

        Customer other = (Customer) obj;

        return id == other.id
                && gender == other.gender
                && Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender);
    }
}