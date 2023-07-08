package com.geekster.employeeaddressmanagement.controller;

import com.geekster.employeeaddressmanagement.model.Address;
import com.geekster.employeeaddressmanagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping
    public Iterable<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PostMapping
    public void createAddress(@RequestBody Address address) {
        addressService.createAddress(address);
    }

    @PutMapping("/{id}")
    public void updateAddressById(@PathVariable Long id, @RequestBody Address address) {
        addressService.updateAddressById(id,address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddressById(@PathVariable Long id) {
        addressService.deleteAddressById(id);
    }

}
