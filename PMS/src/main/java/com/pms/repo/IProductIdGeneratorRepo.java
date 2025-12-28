package com.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entity.ProductIdGenerator;

public interface IProductIdGeneratorRepo extends JpaRepository<ProductIdGenerator, Integer> {

}
