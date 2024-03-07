package casestudy2.repository;




import casestudy2.common.ReadAndWrite;
import casestudy2.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH = "src/casestudy2/data/Customer.csv";
    private static List<Customer> customerList = new ArrayList<>();
    @Override
    public List<Customer> getCustomer() {
        List<String> strings = ReadAndWrite.readFile(PATH);
        customerList.clear();
        String[] info;
        for (String str : strings){
            info = str.split(",");
            customerList.add(new Customer(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8]));
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> strings = new ArrayList<>();
    }
}