package com.shopping.services.categoryservices;

import com.shopping.dtos.CategoryDto;

public interface ICategoryService {
    void addCategory(CategoryDto categoryDto);
    void updateCategory(CategoryDto categoryDto , long id);
    CategoryDto getCategory(long id);
    void deleteCategory(long id);
}
