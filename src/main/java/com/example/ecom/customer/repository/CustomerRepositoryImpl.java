package com.example.ecom.customer.repository;

import com.example.ecom.customer.model.Customer;
import com.example.ecom.customer.model.QCustomer;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Customer> findCustomersByEmail(String email) {
        QCustomer qCustomer = QCustomer.customer;
        JPAQuery<Customer> query = new JPAQuery<>(entityManager);

        return query.from(qCustomer)
                .where(qCustomer.email.eq(email))
                .fetch();
    }
}
