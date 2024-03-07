package casestudy.repository;

import casestudy.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getCustomer();
    void addCustomer(Customer customer);
    void deteleCustomer(Customer customer);
    List<Customer> searchCustomer(String searchCustomer);
}
