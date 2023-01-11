package com.example.Req.Customer;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerserviceImpl implements CustomerService {

    @Autowired
    customerRepo customerRepo;


    @Override
    @Transactional
    public customerModel saveCustomer(customerModel customerModel) {
        return customerRepo.save(customerModel);
    }

    @Override
    public List<customerModel> getAllCustomer() {
        return customerRepo.findAll();
    }
}
