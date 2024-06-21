package com.main.backend.Domain.Dto.Categories;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUpdateCategoryDto {
    private String name;
}
