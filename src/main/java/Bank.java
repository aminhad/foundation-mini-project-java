import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.name = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            branches.add(branch);
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initTransaction) {
        if(findBranch(branchName) != null) {
            findBranch(branchName).newCustomer(customerName, initTransaction);
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if(findBranch(branchName) != null) {
            findBranch(branchName).addCustomerTransaction(customerName, transaction);
            return true;
        }
        return false;
    }
    private Branch findBranch(String branchName) {
        for(Branch branch : branches) {
            if(branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean printTransaction) {
        if(findBranch(branchName) != null && printTransaction) {
            Branch branch = findBranch(branchName);
            for(Customer customer : branch.getCustomers()) {
                System.out.println("Customer name: ");
                System.out.println(customer.getName());
                for(Double transaction : customer.getTransactions()) {
                    System.out.println("Customer transacrion: ");
                    System.out.println(transaction);
                }
            }
            return true;
        }
        return false;
    }
}
