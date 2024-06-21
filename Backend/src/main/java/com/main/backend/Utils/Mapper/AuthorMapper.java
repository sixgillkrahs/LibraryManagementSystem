package com.main.backend.Utils.Mapper;

import com.main.backend.Domain.Dto.Authors.AuthorDto;
import com.main.backend.Domain.Dto.Authors.CreateUpdateAuthorDto;
import com.main.backend.Domain.Model.Authors.Author;

public class AuthorMapper {
    public static AuthorDto toAuthorDto(Author author) {
        return new AuthorDto(author.getFirstName(), author.getSurName());
    }

    public static Author toAuthor(CreateUpdateAuthorDto createUpdateAuthorDto) {
        return new Author(createUpdateAuthorDto.getFirstName(), createUpdateAuthorDto.getSurName());
    }
}
