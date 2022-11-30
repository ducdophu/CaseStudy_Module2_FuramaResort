package services.Impl;

import models.Employee;
import services.EmployeeService;
import utils.RegexPerson;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addNew() {
        int size = employeeList.size();
        int id = (size > 0) ? (size + 1) : 1;
        System.out.println("employeeID: " + id);
        String fullName = RegexPerson.inputName();
        String dateOfBirth = RegexPerson.inputDateOfBirth();
        String gender = RegexPerson.inputGender();
        String identityCard = RegexPerson.inputIdentityCard();
        String phoneNumber = RegexPerson.inputPhoneNumber();
        String email = RegexPerson.inputEmail();
        String level = RegexPerson.inputLevel();
        String position = RegexPerson.inputPosition();
        double salary = RegexPerson.inputSalary();
        Employee employee = new Employee(id, fullName, dateOfBirth, gender, identityCard, phoneNumber, email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        int id = RegexPerson.inputId();
        boolean isExisted = false;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == id) {
                isExisted = true;
                employee.setFullName(RegexPerson.inputName());
                employee.setDateOfBirth(RegexPerson.inputDateOfBirth());
                employee.setGender(RegexPerson.inputGender());
                employee.setIdentityCard(RegexPerson.inputIdentityCard());
                employee.setPhoneNumber(RegexPerson.inputPhoneNumber());
                employee.setEmail(RegexPerson.inputEmail());
                employee.setLevel(RegexPerson.inputLevel());
                employee.setPosition(RegexPerson.inputPosition());
                employee.setSalary(RegexPerson.inputSalary());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id=%s Not existed.\n", id);
        } else {
            System.out.println(employeeList);
        }
    }

    @Override
    public void displayList() {
        for( Employee employee: employeeList){
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.addNew();
        employeeService.displayList();
    }
}