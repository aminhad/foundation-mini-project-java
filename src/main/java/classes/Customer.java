package classes;

import interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double transaction){
        this.name = customerName;
        this.transactions = new ArrayList<>();
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    @Override
    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}

