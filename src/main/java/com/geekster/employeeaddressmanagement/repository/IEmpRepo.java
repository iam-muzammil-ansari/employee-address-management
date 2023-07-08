package com.geekster.employeeaddressmanagement.repository;

import com.geekster.employeeaddressmanagement.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpRepo extends CrudRepository<Employee,Long> {
}