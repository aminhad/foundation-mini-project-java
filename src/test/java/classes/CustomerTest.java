package classes;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @org.junit.Before
    public void setUp() throws Exception {
        customer = new Customer ("Agbesi", 4.04);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getName() {
        assertEquals("Agbesi", customer.getName());
    }

    @org.junit.Test
    public void getTransactions() {
        assertEquals(4.04, (double) customer.getTransactions().get(0), 0.00);
    }

    @org.junit.Test
    public void addTransaction() {
        customer.addTransaction(3.02);
        assertEquals(2, customer.getTransactions().size());
    }
}