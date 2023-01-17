package com.example.crudapi.persistence.repository;

import com.example.crudapi.domain.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findProductByIdAndDeleted(Long id, Boolean deleted);
}
