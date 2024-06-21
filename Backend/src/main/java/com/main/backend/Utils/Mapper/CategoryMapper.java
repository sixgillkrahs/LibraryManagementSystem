package com.main.backend.Utils.Mapper;

import com.main.backend.Domain.Dto.Categories.CategoryDto;
import com.main.backend.Domain.Dto.Categories.CreateUpdateCategoryDto;
import com.main.backend.Domain.Model.Categories.Category;

public class CategoryMapper {
    public static CategoryDto toCategoryDto(Category category) {
        return new CategoryDto(category.getId(), category.getName());
    }

    public static Category toCategory(CreateUpdateCategoryDto createUpdateCategoryDto) {
        return new Category(createUpdateCategoryDto.getName());
    }
}
