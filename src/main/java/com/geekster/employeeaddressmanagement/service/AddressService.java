package com.geekster.employeeaddressmanagement.service;

import com.geekster.employeeaddressmanagement.model.Address;
import com.geekster.employeeaddressmanagement.repository.IAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddRepo iAddRepo;

    public Iterable<Address> getAllAddresses() {
        return iAddRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return iAddRepo.findById(id).orElse(null);
    }

    public void createAddress(Address address) {
        iAddRepo.save(address);
    }

    public void updateAddressById(Long id, Address address) {
        Address address1 = iAddRepo.findById(id).orElse(null);
        if (address1 != null) {
            address.setStreet(address.getStreet());
            address.setCity(address.getCity());
            address.setState(address.getState());
            address.setZipCode(address.getZipCode());
            iAddRepo.save(address);
        }
    }

    public void deleteAddressById(Long id) {
        iAddRepo.deleteById(id);
    }
}
