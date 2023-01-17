package com.example.crudapi.web.controller;

import com.example.crudapi.domain.entity.Category;
import com.example.crudapi.domain.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    public ResponseEntity<List<Category>> getAllCategories(){
        return new ResponseEntity<>(categoryService.findAllCategories(), HttpStatus.OK);
    }

    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Short id){
        return new ResponseEntity<>(categoryService.findCategoryById(id), HttpStatus.OK);
    }
}
