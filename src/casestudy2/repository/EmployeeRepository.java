package casestudy2.repository;

import casestudy2.common.ReadAndWrite;
import casestudy2.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static final String PATH = "src/casestudy2/data/Employee.csv";
    private static List<Employee> employeeList = new ArrayList<>();
    @Override
    public List<Employee> getEmployee() {
        List<String> strings = ReadAndWrite.readFile(PATH);
        employeeList.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            employeeList.add(new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9]));

        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getCodeEmployee()+","+employee.getNameEmployee()+","+employee.getDatatime()
                +","+employee.getGender()+","+employee.getCitizenIdentification()+","+employee.getPhoneNumber()
                +","+employee.getEmail()+","+employee.getLevel()+","+employee.getLocation()+","+employee.getMoney());
        ReadAndWrite.writeFile(PATH,stringList,true);
    }

    @Override
    public void deteleEmployee(Employee employee) {
        List<String> strings = new ArrayList<>();
        employeeList = getEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if ((employeeList.get(i).getCodeEmployee().equals(employee.getCodeEmployee())));
            employeeList.remove(i);
            break;
        }
        for (Employee temp : employeeList) {
            strings.add(temp.getCodeEmployee()+","+temp.getNameEmployee()+","+temp.getDatatime()+","+temp.getGender()
                    +","+temp.getCitizenIdentification()+","+temp.getPhoneNumber()+","+temp.getEmail()+","+temp.getLevel()+","+temp.getLocation()+","+temp.getMoney());
        }
        ReadAndWrite.writeFile(PATH,strings,false);
    }

    @Override
    public List<Employee> seach(String seachEmployee) {
        List<Employee> employees = getEmployee();
        List<Employee> strings = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getNameEmployee().contains(seachEmployee)){
                strings.add(employees.get(i));
            }
        }
        return strings;
    }
}
