package com.geekster.employeeaddressmanagement.service;

import com.geekster.employeeaddressmanagement.model.Employee;
import com.geekster.employeeaddressmanagement.repository.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    IEmpRepo iEmpRepo;


    public Iterable<Employee> getAllEmployees() {
        return iEmpRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return iEmpRepo.findById(id).orElse(null);
    }

    public void createEmployee(Employee employee) {
        iEmpRepo.save(employee);
    }

    public void updateEmployee(Long id, Employee employee) {
        Employee employee1 = iEmpRepo.findById(id).orElse(null);
        if (employee1 != null) {
            employee.setFirstName(employee.getFirstName());
            employee.setLastName(employee.getLastName());
            employee.setAddress(employee.getAddress());
            iEmpRepo.save(employee);
        }
    }

    public void deleteEmployee(Long id) {
        iEmpRepo.deleteById(id);
    }

}
