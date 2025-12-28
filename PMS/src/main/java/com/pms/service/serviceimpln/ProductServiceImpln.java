package com.pms.service.serviceimpln;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.pms.entity.Product;
import com.pms.entity.ProductIdGenerator;
import com.pms.repo.IProductIdGeneratorRepo;
import com.pms.repo.IProductRepo;
import com.pms.service.IProductService;

@Service
public class ProductServiceImpln implements IProductService {

	@Autowired
	BCryptPasswordEncoder encoder;
	@Autowired
	IProductRepo productRepo;
	@Autowired
	IProductIdGeneratorRepo iproductRepo;

	Product addProduct(Product p) {
		String prodId=productIdGenerator();
		p.setPid(prodId);
		return productRepo.save(p);
	}
	private String productIdGenerator() {
		ProductIdGenerator i = iproductRepo.save(new ProductIdGenerator());
		int id = i.getId();
		if (id < 10) {
			return "PROD00" + id;
		} else if (id < 100) {
			return "PROD0" + id;
		}
		return "PROD" + id;
	}
}
