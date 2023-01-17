package com.example.crudapi.domain.service;

import com.example.crudapi.common.dto.ProductDto;
import com.example.crudapi.domain.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();
    Product findProductById(Long id);
    Product createProduct(ProductDto productDto);
    Product updateProduct(ProductDto productDto);
    Product updateProductPriceById(Long id, BigDecimal price);
    void disableProductById(Long id);
}
