package com.example.hateoasspringdemo.dao;

import com.example.hateoasspringdemo.ds.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends CrudRepository<Address,Integer> {
}
