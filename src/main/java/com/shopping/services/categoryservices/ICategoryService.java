package com.shopping.services.categoryservices;

import com.shopping.dtos.CategoryDto;
import com.shopping.models.Category;

public interface ICategoryService {
    CategoryDto addCategory(Category category);
    void updateCategory(Category category , long id);
    CategoryDto getCategory(long id);
    void deleteCategory(long id);
}
