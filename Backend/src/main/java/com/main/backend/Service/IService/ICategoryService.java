package com.main.backend.Service.IService;

import com.main.backend.Domain.Dto.Categories.CategoryDto;
import com.main.backend.Domain.Dto.Categories.CreateUpdateCategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ICategoryService {
    public List<CategoryDto> getAll();
    public CategoryDto getById(UUID id);
    public CategoryDto save(CreateUpdateCategoryDto input);
    public CategoryDto update(UUID id, CreateUpdateCategoryDto input);
    public void delete(UUID id);
}
