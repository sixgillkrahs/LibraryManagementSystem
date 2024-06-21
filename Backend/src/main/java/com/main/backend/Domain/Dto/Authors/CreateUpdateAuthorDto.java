package com.main.backend.Domain.Dto.Authors;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUpdateAuthorDto {
    private String firstName;
    private String surName;
}
