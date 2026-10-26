package assinemnt;

import java.util.HashSet;

public class CustomerOperations {

    private HashSet<Customer> customers = new HashSet<>();

    public CustomerOperations() {
        customers.add(new Customer(201, "Akhil", "Reddy", 'M'));
        customers.add(new Customer(202, "Meghana", "Shah", 'F'));
        customers.add(new Customer(203, "Vikram", "Naidu", 'M'));
        customers.add(new Customer(204, "Divya", "Mehta", 'F'));
        customers.add(new Customer(205, "Nikhil", "Varma", 'M'));
    }

    public HashSet<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(int id, String firstName,
                              String lastName, char gender) {
        if (findCustomerById(id) != null) {
            return false;
        }

        return customers.add(
                new Customer(id, firstName, lastName, gender));
    }

    public boolean updateCustomer(int id, String firstName,
                                  String lastName, char gender) {
        Customer customer = findCustomerById(id);

        if (customer != null) {
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setGender(gender);
            return true;
        }

        return false;
    }

    public boolean deleteCustomer(int id) {
        Customer customer = findCustomerById(id);

        if (customer != null) {
            return customers.remove(customer);
        }

        return false;
    }

    public Customer findCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }

        return null;
    }

    public Customer findCustomerByFirstName(String firstName) {
        for (Customer customer : customers) {
            if (customer.getFirstName().equalsIgnoreCase(firstName)) {
                return customer;
            }
        }

        return null;
    }
}