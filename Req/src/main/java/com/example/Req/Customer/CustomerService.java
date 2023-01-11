package com.example.Req.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerService {

    customerModel saveCustomer(customerModel customerModel);

    List<customerModel> getAllCustomer();
}
