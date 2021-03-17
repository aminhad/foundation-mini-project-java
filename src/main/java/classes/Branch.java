import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName){
        this.name = branchName;
        this.customers = new ArrayList<>();
    }
    public String getName() { return name; }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initTransaction) {
        if(findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initTransaction);
            customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        if(findCustomer(customerName) != null) {
            Customer customers = findCustomer(customerName);
            customers.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(Customer customer: customers) {
            if(customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        return null;
    }
}
