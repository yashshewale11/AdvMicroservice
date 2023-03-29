package com.csi.dao;

import com.csi.model.Product;
import com.csi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductDaoImpl {

    @Autowired
    ProductRepo productRepoImpl;

    public Product save(Product product) {
        return productRepoImpl.save(product);
    }

    public Optional<Product>getDataById(long productId) {
        return productRepoImpl.findById(productId);
    }
}
