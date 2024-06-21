package com.main.backend.Domain.Dto.Authors;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private String firstName;
    private String surName;
}
