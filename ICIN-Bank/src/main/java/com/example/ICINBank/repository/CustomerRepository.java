package com.example.ICINBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ICINBank.Model.CustomerInfo;

public interface CustomerRepository extends CrudRepository <CustomerInfo,Integer> {

}
