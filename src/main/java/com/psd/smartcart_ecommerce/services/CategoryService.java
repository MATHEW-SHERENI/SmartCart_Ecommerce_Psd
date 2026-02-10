package com.psd.smartcart_ecommerce.services;

import com.psd.smartcart_ecommerce.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long categoryId);
    Category updateCategory(Category category, Long categoryId);
}
