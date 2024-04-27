package com.shopping.controllers;

import com.shopping.dtos.CategoryDto;
import com.shopping.models.Category;
import com.shopping.services.categoryservices.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

  /*  @PostMapping(value = "addCategory")
    public ResponseEntity<Categories> addCategory(@RequestBody CategoryDto categoryDto){
       // return ResponseEntity.ok().body(iCategoryService.addCategory(categoryDto));
    }*/

    /*@PostMapping
    public ResponseEntity<Categories> updateCategory(@PathVariable Long id , @RequestBody CategoryDto categoryDto){

    }*/

    @PostMapping(name = "add-category")
    public ResponseEntity<CategoryDto> addCategory(@RequestBody Category category){
        CategoryDto categoryDto= iCategoryService.addCategory(category);
        return new ResponseEntity<CategoryDto>(categoryDto , HttpStatus.CREATED);
    }
}
