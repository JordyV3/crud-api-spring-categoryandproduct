package com.example.crudapi.domain.service.implementation;

import com.example.crudapi.common.dto.CategoryDto;
import com.example.crudapi.domain.entity.Category;
import com.example.crudapi.domain.service.CategoryService;
import com.example.crudapi.persistence.repository.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    private void categoryExist(String name){
        if (categoryRepository.existsByName(name)){
            throw new DuplicateKeyException("the name of category is already registered");
        }
    }

    @Override
    public List<Category> findAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public Category findCategoryById(Short id) {
        Category category = categoryRepository.findCategoriesBy(id);
        if (category == null){
            throw new EntityNotFoundException("The category with id "+id+ "is not found");
        }
        return category;
    }

    @Override
    public Category createCategory(CategoryDto categoryDto) {
        Category category = new Category();
        this.categoryExist(categoryDto.getName());
        BeanUtils.copyProperties(categoryDto, category);
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(CategoryDto categoryDto) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDto, category);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryById(Short id) {
        this.findCategoryById(id);
        categoryRepository.deleteById(id);
    }
}
