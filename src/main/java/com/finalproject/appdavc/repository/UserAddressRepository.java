package com.finalproject.appdavc.repository;

import com.finalproject.appdavc.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface UserAddressRepository extends CrudRepository<Address, Long> {
}
