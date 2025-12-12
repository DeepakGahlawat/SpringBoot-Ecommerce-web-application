package com.ecommerceappliction.ecomapp.service;


import com.ecommerceappliction.ecomapp.payload.CategoryDTO;
import com.ecommerceappliction.ecomapp.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
