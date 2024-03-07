package casestudy.service;

import casestudy.model.Customer;
import casestudy.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService{
    CustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayCustomer() {
        List<Customer> customerList = customerRepository.getCustomer();
        for (Customer e : customerList){
            System.out.println(e);
        }

    }
//Mã khách hàng, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ
    @Override
    public void addCustomer() {
        System.out.println("Nhập mã khách hàng : ");
        String code = scanner.nextLine();
        System.out.println("Nhập Họ và tên của khách hàng : ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh của khách hàng : ");
        String dataTime = scanner.nextLine();
        System.out.println("Nhập giới tính của khách hàng : ");
        String gender = scanner.nextLine();
        System.out.println("Nhập Số CCCD của khách hàng : ");
        String citizenIdentification = scanner.nextLine();
        System.out.println("Nhập số điện thoại của khách hàng : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Email của khách hàng : ");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng : ");
        String typeOfGuest = scanner.nextLine();
        System.out.println("Nhập địa chỉ của khách hàng : ");
        String address = scanner.nextLine();
        Customer customer = new Customer(code,name,dataTime,gender,citizenIdentification,phoneNumber,email,typeOfGuest,address);
        customerRepository.addCustomer(customer);
    }

    @Override
    public void deteleCustomer() {
        System.out.println("Nhập Mã khách hàng mà bạn muốn xóa :");
        String idCustomer = scanner.nextLine();
        List<Customer> customerList = customerRepository.getCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (idCustomer.equals(customerList.get(i).getEmployeeCode())){
                customerRepository.deteleCustomer(customerList.get(i));
                System.out.println("Bạn đã xóa thành công");
            }
        }
    }

    @Override
    public void searchCustomer() {
        System.out.println("Nhập tên khách hàng mà bạn muốn tìm kiếm : ");
        String search = scanner.nextLine();
        List<Customer> customers = customerRepository.searchCustomer(search);
        for (Customer e : customers) {
            System.out.println(e);
        }
    }
}
