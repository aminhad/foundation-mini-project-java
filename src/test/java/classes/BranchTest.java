package classes;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;

    @org.junit.Before
    public void setUp() throws Exception {
        branch = new Branch("citi");
        branch.newCustomer("Samir", 283.88);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getName() {
        assertEquals("citi", branch.getName());
    }

    @org.junit.Test
    public void getCustomers() {
        assertEquals("Samir", branch.getCustomers().get(0).getName());
    }

    @org.junit.Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Nasir", 28.22));
        assertFalse(branch.newCustomer("Samir", 283.88));
    }

    @org.junit.Test
    public void addCustomerTransaction() {
        assertTrue(branch.addCustomerTransaction("Samir", 283.88));
        assertFalse(branch.addCustomerTransaction("Nasir", 28.22));
    }
}