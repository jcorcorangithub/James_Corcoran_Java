package myCompany;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CustomerTest {
//    Address billingAddress;
//    Address shippingAddress;
//    Customer customer;
//
//    @Before
//    public void setUp(){
        Address billingAddress = new Address("martin st","florida avenue","northport","NY","64773");
        Address shippingAddress = new Address("joyce st","amber avenue","massapequa","NY","64773");

        Customer customer = new Customer("James","corc","email", "7775343",shippingAddress, billingAddress, false);
//    }

    @Test
    public void test(){
        assertEquals("James",customer.getFirstName());
        assertEquals("martin st", customer.getBillingAddress().getStreet1());
        assertEquals("amber avenue", customer.getShippingAddress().getStreet2());
        assertFalse(customer.isRewardsMember());
        assertEquals("email", customer.getEmail());
        customer.setEmail("otheremail");
        assertEquals("otheremail", customer.getEmail());
    }

}
