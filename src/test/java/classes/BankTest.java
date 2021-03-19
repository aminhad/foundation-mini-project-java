package classes;

import static org.junit.Assert.*;

public class BankTest {
    Bank bank;

    @org.junit.Before
    public void setUp() throws Exception {
        bank = new Bank("Digi Bank");
        bank.addBranch("RaceCourse");
        bank.addCustomer("RaceCourse", "Ali", 232.22);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addBranch() {
        assertTrue(bank.addBranch("soft branch"));
    }

    @org.junit.Test
    public void addCustomer() {
        assertTrue(bank.addCustomer("soft branch", "Kofi", 822.33));

        assertFalse(bank.addCustomer("RaceCourse", "Ali", 500.32));
    }

    @org.junit.Test
    public void addCustomerTransaction() {
        assertTrue(bank.addCustomer("soft branch", "Kofi", 822.73));

        assertFalse(bank.addCustomer("RaceCourse", "Ali", 500.39));
    }

    @org.junit.Test
    public void listCustomers() {

        assertTrue(bank.listCustomers("RaceCourse", false));

        assertFalse(bank.listCustomers("no branch", false));
    }
}