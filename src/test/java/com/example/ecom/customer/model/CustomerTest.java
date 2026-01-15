package com.example.ecom.customer.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testCustomer() {
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("John Doe");
        customer.setEmail("john@example.com");

        assertEquals(Long.valueOf(1L), customer.getId());
        assertEquals("John Doe", customer.getName());
        assertEquals("john@example.com", customer.getEmail());
    }
}
