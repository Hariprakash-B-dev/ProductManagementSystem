package com.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entity.OwnerIdGenerator;


public interface IOwnerIdGeneratorRepo extends JpaRepository<OwnerIdGenerator, Integer>  {

}
