package casestudy2.service;


import casestudy2.model.Customer;
import casestudy2.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    private CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void displayCustomer() {
       List<Customer> customerList = customerRepository.getCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {

    }
}
