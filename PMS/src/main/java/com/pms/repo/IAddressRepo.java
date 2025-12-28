package com.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entity.Address;

public interface IAddressRepo extends JpaRepository<Address, Integer> {

}
