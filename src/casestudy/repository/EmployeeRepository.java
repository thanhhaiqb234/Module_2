package casestudy.repository;

import casestudy.common.ReadAndWrite;
import casestudy.model.Employee;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository{
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String PATH = "src/casestudy/data/Employee.csv";
//public Employee(String employeeCode, String name, String dataTime, String gender, String citizenIdentification,
//                    String phoneNumber, String email, String level, String location, String money)
    @Override
    public List<Employee> getEmployee() {
        List<String> strings = ReadAndWrite.readFile(PATH);
        employeeList.clear();
        String[] info;
        for (String str:strings){
            info = str.split(",");
            employeeList.add(new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9]));
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> strings = new ArrayList<>();
        strings.add(employee.getEmployeeCode()+","+employee.getName()+","+employee.getDataTime()+","+employee.getGender()+","
                +employee.getCitizenIdentification()+","+employee.getPhoneNumber()+","+employee.getEmail()+","+employee.getLevel()+
                ","+employee.getLocation()+","+employee.getMoney());
        ReadAndWrite.writeFile(PATH,strings,true);
    }

    @Override
    public void deteleEmployee(Employee employee) {
       List<String> stringList = new ArrayList<>();
        employeeList = getEmployee();
        for(int i = 0; i< employeeList.size(); i++) {
            if(employeeList.get(i).getEmployeeCode().equals(employee.getEmployeeCode())) {
                employeeList.remove(i);
                break;
            }
        }
        for(Employee temp: employeeList) {
            stringList.add(temp.getEmployeeCode()+","+temp.getName()+","+temp.getDataTime()+","+temp.getGender()+","
                    +temp.getCitizenIdentification()+","+temp.getPhoneNumber()+","+temp.getEmail()+","+temp.getLevel()+
                    ","+temp.getLocation()+","+temp.getMoney());
        }
        ReadAndWrite.writeFile(PATH,stringList,false);
    }

    @Override
    public List<Employee> searchEmployee(String searchEmployee) {
        List<Employee> employees = getEmployee();
        List<Employee> stringList = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if ((employeeList.get(i).getName().contains(searchEmployee))){
                stringList.add(employeeList.get(i));
            }
        }
        return stringList;
    }

}
