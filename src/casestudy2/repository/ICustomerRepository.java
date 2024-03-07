package casestudy2.repository;


import casestudy2.model.Customer;
import casestudy2.model.Employee;

import java.util.List;

public interface ICustomerRepository {
  List<Customer> getCustomer();
  void addCustomer(Customer customer);
}
