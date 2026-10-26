package assinemnt;

public class CustomerMain {

    public static void main(String[] args) {

        CustomerOperations operations = new CustomerOperations();
        System.out.println(operations.getCustomers());
        System.out.println(operations.addCustomer(206, "Pooja", "Rao", 'F'));
        System.out.println(operations.getCustomers());
        System.out.println(operations.addCustomer(206, "Pooja", "Rao", 'F'));
        System.out.println(operations.updateCustomer(203, "Varun", "Krishna", 'M'));
        System.out.println(operations.getCustomers());
        System.out.println(operations.deleteCustomer(204));
        System.out.println(operations.getCustomers());
        System.out.println(operations.findCustomerByFirstName("Meghana"));
        System.out.println(operations.findCustomerById(202));
        System.out.println(operations.findCustomerById(999));
        System.out.println(operations.getCustomers());
    }
}