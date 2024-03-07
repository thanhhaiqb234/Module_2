package casestudy.repository;

import casestudy.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
List<Employee> getEmployee();
void addEmployee(Employee employee);
void deteleEmployee(Employee employee);
List<Employee> searchEmployee(String searchEmployee);
}
