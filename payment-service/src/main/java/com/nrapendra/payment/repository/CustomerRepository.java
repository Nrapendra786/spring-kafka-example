package com.nrapendra.payment.repository;

import com.nrapendra.payment.domain.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
