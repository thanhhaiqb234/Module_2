package casestudy.repository;

import casestudy.common.ReadAndWrite;
import casestudy.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/casestudy/data/Customer.csv";
    @Override
    public List<Customer> getCustomer() {
        List<String> strings = ReadAndWrite.readFile(PATH);
        customerList.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            customerList.add(new Customer(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8]));
        }
        return customerList;
    }
//String employeeCode, String name, String dataTime, String gender, String citizenIdentification,
//                    String phoneNumber, String email, String typeOfGuest, String address
    @Override
    public void addCustomer(Customer customer) {
        List<String> strings = new ArrayList<>();
        strings.add(customer.getEmployeeCode()+","+customer.getName()+","+customer.getDataTime()+","+customer.getGender()+","+
                customer.getCitizenIdentification()+","+customer.getPhoneNumber()+","+customer.getEmail()+","+
                customer.getTypeOfGuest()+","+customer.getAddress());
        ReadAndWrite.writeFile(PATH,strings,true);
    }

    @Override
    public void deteleCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        customerList = getCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if ((customerList.get(i).getEmployeeCode().equals(customer.getEmployeeCode()))){
                customerList.remove(i);
                break;
            }
        }
        for (Customer temp : customerList) {
            stringList.add(temp.getEmployeeCode()+","+temp.getName()+","+temp.getDataTime()+","+temp.getGender()+","+
                    temp.getCitizenIdentification()+","+temp.getPhoneNumber()+","+temp.getEmail()+","+
                    temp.getTypeOfGuest()+","+temp.getAddress());
        }
        ReadAndWrite.writeFile(PATH,stringList,false);
    }

    @Override
    public List<Customer> searchCustomer(String searchCustomer) {
        List<Customer> customers = getCustomer();
        List<Customer> customerList1 = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            if (customerList.get(i).getName().contains(searchCustomer)){
                customerList1.add(customerList.get(i));
            }
        }
        return customerList1;
    }
}
