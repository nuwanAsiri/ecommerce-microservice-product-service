package com.ecommerce.microservice.product.service;

import com.ecommerce.microservice.product.entity.Product;
import com.ecommerce.microservice.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails){
        Product product = productRepository.findById(id).orElseThrow();
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
