package casestudy.service;
import casestudy.model.Employee;
import casestudy.repository.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    private Scanner scanner = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void displayEmployee() {
        List<Employee> employees = employeeRepository.getEmployee();
        for (Employee e : employees){
            System.out.println(e);
        }
    }
//Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
    ////public Employee(String employeeCode, String name, String dataTime, String gender, String citizenIdentification,
////                    String phoneNumber, String email, String level, String location, String money)
    @Override
    public void addEmployee() {
        System.out.println("Nhập mã nhân viên :");
        String idCode = scanner.nextLine();
        System.out.println("Họ và tên của nhân viên :");
        String name = scanner.nextLine();
        System.out.println("Ngày tháng năm sinh :");
        String dataTime = scanner.nextLine();
        System.out.println("Nhập giới tính :");
        String gender = scanner.nextLine();
        System.out.println("Số căn cước công dân : ");
        String citizenIdentification = scanner.nextLine();
        System.out.println("Số điện thoại liên hệ : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Email :");
        String email = scanner.nextLine();
        System.out.println("Trình độ của bạn : ");
        String level = scanner.nextLine();
        System.out.println("chức vụ/vị trí bạn đang đảm nhận :");
        String location = scanner.nextLine();
        System.out.println("Nhập số lương :");
        String money = scanner.nextLine();
        Employee employee = new Employee(idCode,name,dataTime,gender,citizenIdentification,phoneNumber,email,level,location,money);
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void deteleEmployee() {
        System.out.println("Nhập mã nhân viên bạn cần xóa vào đây :");
        String idEmployee = scanner.nextLine();
        List<Employee> employees = employeeRepository.getEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (idEmployee.equals(employees.get(i).getEmployeeCode())){
                employeeRepository.deteleEmployee(employees.get(i));
                System.out.println("Bạn đã xóa thành công");
            }
        }
    }

    @Override
    public void searchEmployee() {
        System.out.println("Nhập tên nhân viên mà bạn muốn tìm kiếm : ");
        String searchEmployee = scanner.nextLine();
        List<Employee> employees = employeeRepository.searchEmployee(searchEmployee);
        for (Employee name : employees) {
            System.out.println(name);
        }

    }
}
