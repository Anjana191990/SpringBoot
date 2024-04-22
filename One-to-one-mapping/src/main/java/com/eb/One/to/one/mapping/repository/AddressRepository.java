package com.eb.One.to.one.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.One.to.one.mapping.model.Address;

public interface AddressRepository  extends JpaRepository<Address, Long>{
	Address findByZipCode(String id) ;
}
