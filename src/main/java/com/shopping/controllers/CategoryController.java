package com.shopping.controllers;

import com.shopping.services.categoryservices.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
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
}
