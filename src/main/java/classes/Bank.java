import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.name = bankName;
        this.branches = new ArrayList<>();
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
            System.out.println("Customer detail for branch " + branchName);
            int customerCounter = 0;
            for(Customer customer : branch.getCustomers()) {
                customerCounter++;
                System.out.println("Customer: " + customer.getName() + "["+customerCounter+"]");
                int transactionCounter = 0;
                System.out.println("Transactions");
                for(Double transaction : customer.getTransactions()) {
                    transactionCounter++;
                    System.out.println("[" + transactionCounter + "] Amount " + transaction);
                }
            }
            return true;
        }
        else {
            Branch branch = findBranch(branchName);
            int customerCounter = 0;
            System.out.println("Customer detail for branch " + branchName);
            for (Customer customer : branch.getCustomers()) {
                customerCounter++;
                System.out.println("Customer: " + customer.getName() + "[" + customerCounter + "]");
            }
        }
        return false;
    }
}
