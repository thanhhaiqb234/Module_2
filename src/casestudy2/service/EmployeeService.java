package casestudy2.service;
import casestudy.common.ReadAndWrite;
import casestudy2.model.Employee;
import casestudy2.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    private Scanner scanner = new Scanner(System.in);
    private static EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void displayEmployee() {
        List<Employee> employeeList = employeeRepository.getEmployee();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {
        System.out.println("Nhập mã nhân viên : ");
        String code = scanner.nextLine();
        System.out.println("Nhâp họ và tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh : ");
        String data = scanner.nextLine();
        System.out.println("Nhập giới tính : ");
        String gender = scanner.nextLine();
        System.out.println("Nhập số CCCD : ");
        String citizenIdentification = scanner.nextLine();
        System.out.println("Nhập Số điện thoại : ");
        String phone = scanner.nextLine();
        System.out.println("Nhập Email : ");
        String email = scanner.nextLine();
        String choi1 = "";
        boolean flag1 = true;
        do {
            System.out.println("------Chọn trình độ học vấn-------\n" +
                    "1: Trung học phổ thông\n" +
                    "2: Trung cấp \n" +
                    "3: Cao đẳng \n" +
                    "4: Đại học \n" +
                    "5: Thạc sỹ");
            String level = scanner.nextLine();
            switch (level){
                case "1" :
                    choi1 = "Trung học phổ thông";
                    break;
                case "2" :
                    choi1 = "Trung cấp";
                    break;
                case "3" :
                    choi1 = "Cao đẳng";
                    break;
                case "4" :
                    choi1 = "Đại học";
                    break;
                case "5" :
                    choi1 = "Thạc sỹ";
                    break;
                default:
                    System.out.println("Bạn đã chọn sai vui lòng chọn lại : ");
                    flag1 = false;
                    break;
            }
        }while (!flag1);
        String choi2 = "";
        boolean flag2 = true;
        do {
            System.out.println("--------Chọn vị trí bạn đảm nhiệm-------\n" +
                    "1: Lễ tân \n" +
                    "2: Phục vụ  \n" +
                    "3: Chuyên viên \n" +
                    "4: Giám sát \n" +
                    "5: Quản lý \n" +
                    "6: Giám đốc");
            String location = scanner.nextLine();
            switch (location){
                case "1" :
                    choi2 = "Lễ tân";
                    break;
                case "2" :
                    choi2 = "Phục vụ";
                    break;
                case "3" :
                    choi2 = "Chuyên viên";
                case "4" :
                    choi2 = "Giám sát";
                    break;
                case "5" :
                    choi2 = "Quản lý";
                    break;
                case "6" :
                    choi2 = "Giám đốc";
                    break;
                default:
                    System.out.println("Bạn đã chọn sai xin vui lòng chọn lại : ");
                    flag2 = false;
                    break;
            }
        }while (!flag2);
        System.out.println("Nhập tiền lương : ");
        String money = scanner.nextLine();
        Employee employee = new Employee(code,name,data,gender,citizenIdentification,phone,email,choi1,choi2,money);
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void deteleEmployee() {
        List<Employee> employees = employeeRepository.getEmployee();
        System.out.println("Nhập mã nhân viên mà bạn muốn xóa : ");
        String code = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (code.equals(employees.get(i).getCodeEmployee())){
                employeeRepository.deteleEmployee(employees.get(i));
                System.out.println("* Bạn đã xóa thành công *");
            }
        }
    }

    @Override
    public void seachEmployee() {
        System.out.println("Nhập tên nhân viên mà bạn muốn tìm kiếm : ");
        String seachEmployee = scanner.nextLine();
        List<Employee> employees = employeeRepository.seach(seachEmployee);
        for (Employee name: employees) {
            System.out.println(name);
        }
    }
}
