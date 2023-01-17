package com.example.crudapi.persistence.repository;

import com.example.crudapi.domain.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Short> {
    Category findCategoryById(Short id);
    Boolean existsByName(String name);
}
