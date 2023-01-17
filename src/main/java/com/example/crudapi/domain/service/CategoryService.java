package com.example.crudapi.domain.service;

import com.example.crudapi.common.dto.CategoryDto;
import com.example.crudapi.domain.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAllCategories();
    Category findCategoryById(Short id);
    Category createCategory(CategoryDto categoryDto);
    Category updateCategory(CategoryDto categoryDto);
    void deleteCategoryById(Short id);
}
