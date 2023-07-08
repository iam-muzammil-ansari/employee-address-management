package com.geekster.employeeaddressmanagement.repository;

import com.geekster.employeeaddressmanagement.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddRepo extends CrudRepository<Address,Long> {
}
