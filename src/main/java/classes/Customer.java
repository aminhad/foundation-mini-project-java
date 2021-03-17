import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double transaction){
        this.name = customerName;
        this.transactions = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }
    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}

