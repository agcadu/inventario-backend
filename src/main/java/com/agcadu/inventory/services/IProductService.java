package com.agcadu.inventory.services;

import com.agcadu.inventory.model.Product;
import com.agcadu.inventory.response.ProductResponseRest;
import com.agcadu.inventory.response.ResponseRest;
import org.springframework.http.ResponseEntity;

public interface IProductService {

    public ResponseEntity<ProductResponseRest> save(Product product, Long categoryId);

}