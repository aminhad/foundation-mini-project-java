package interfaces;

import java.util.ArrayList;

public interface ICustomer {
    public String getName();
    ArrayList<Double> getTransactions();
    void addTransaction(double transaction);
}
