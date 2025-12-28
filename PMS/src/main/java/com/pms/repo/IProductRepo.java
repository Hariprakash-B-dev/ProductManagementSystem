package com.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entity.Product;

public interface IProductRepo extends JpaRepository<Product, String> {

}
