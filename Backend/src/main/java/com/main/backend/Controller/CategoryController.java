package com.main.backend.Controller;


import com.main.backend.Domain.Model.Categories.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {


    public Category createCategory(Category category) {
        return null;
    }
}
