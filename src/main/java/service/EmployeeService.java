package service;

import domain.Employee;

import java.util.List;

/**
 * Created by alvo0416 on 8/23/2016.
 */
public interface EmployeeService {

    public void addEmployee(Employee employee);

    public List<Employee> listEmployee();

    public void removeEmployee(Integer id);



}
