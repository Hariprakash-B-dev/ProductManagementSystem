package com.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entity.Owner;

public interface IOwnerRepo extends JpaRepository<Owner, String> {

}
