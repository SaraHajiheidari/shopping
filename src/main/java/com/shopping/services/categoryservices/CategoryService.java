package com.shopping.services.categoryservices;

import com.shopping.dtos.CategoryDto;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Override
    public void addCategory(CategoryDto categoryDto) {

    }

    @Override
    public void updateCategory(CategoryDto categoryDto, long id) {

    }

    @Override
    public CategoryDto getCategory(long id) {
        return null;
    }

    @Override
    public void deleteCategory(long id) {

    }
}
