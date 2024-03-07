package casestudy2.repository;

import casestudy2.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getEmployee();
    void addEmployee(Employee employee);
    void deteleEmployee(Employee employee);
    List<Employee> seach(String seachEmployee);
}
