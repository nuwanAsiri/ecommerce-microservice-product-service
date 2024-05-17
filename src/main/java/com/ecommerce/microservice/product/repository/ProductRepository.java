package com.ecommerce.microservice.product.repository;

import com.ecommerce.microservice.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
