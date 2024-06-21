package com.main.backend.Service.Service;

import com.main.backend.Domain.Dto.Categories.CategoryDto;
import com.main.backend.Domain.Dto.Categories.CreateUpdateCategoryDto;
import com.main.backend.Domain.Model.Categories.Category;
import com.main.backend.Repository.CategoryRepository;
import com.main.backend.Service.IService.ICategoryService;
import com.main.backend.Utils.Mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class CategoryService implements ICategoryService{

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<CategoryDto> getAll() {
        List<CategoryDto> dtos = new ArrayList<>();
        for (Category category : categoryRepository.findAll()){
            dtos.add(CategoryMapper.toCategoryDto(category));
        }
        return dtos;
    }

    @Override
    public CategoryDto getById(UUID id) {
        return categoryRepository.findById(id).map(CategoryMapper::toCategoryDto).orElse(null);
    }

    @Override
    public CategoryDto save(CreateUpdateCategoryDto input) {
        Category category = CategoryMapper.toCategory(input);
        return CategoryMapper.toCategoryDto(categoryRepository.save(category));
    }

    @Override
    public CategoryDto update(UUID id, CreateUpdateCategoryDto input) {
        Category category = categoryRepository.findById(id).orElse(null);
        if (category != null){
            category.setName(input.getName());
            return CategoryMapper.toCategoryDto(categoryRepository.save(category));
        }
        return null;
    }

    @Override
    public void delete(UUID id) {
        categoryRepository.deleteById(id);
    }
}
