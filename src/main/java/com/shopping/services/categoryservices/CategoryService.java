package com.shopping.services.categoryservices;

import com.shopping.dtos.CategoryDto;
import com.shopping.exceptions.ApiException;
import com.shopping.models.Category;
import com.shopping.reposietories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class CategoryService implements ICategoryService {


    private final CategoryRepository categoryRepository;


    @Autowired
    private ModelMapper modelmapper;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDto addCategory(Category category) {

        Category categoryResult = categoryRepository.findByCategoryName(category.getCategory_name());
        if(categoryResult != null){
            throw new ApiException("Category mit dieser Name gibt es!!!");
        }

        if (category.getCategory_name() != null && category.getCategory_type() != null && category.getProducts() != null) {
            categoryResult = categoryRepository.save(category);
        }

        return modelmapper.map(categoryResult , CategoryDto.class);
    }

    @Override
    public void updateCategory(Category category, long id) {

    }

    @Override
    public CategoryDto getCategory(long id) {
        return null;
    }

    @Override
    public void deleteCategory(long id) {

    }
}
