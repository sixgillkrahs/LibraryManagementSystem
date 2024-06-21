package com.main.backend.Service.Service;

import com.main.backend.Domain.Dto.Authors.AuthorDto;
import com.main.backend.Domain.Dto.Authors.CreateUpdateAuthorDto;
import com.main.backend.Domain.Dto.Categories.CategoryDto;
import com.main.backend.Domain.Model.Authors.Author;
import com.main.backend.Domain.Model.Categories.Category;
import com.main.backend.Repository.AuthorRepository;
import com.main.backend.Service.IService.IAuthorService;
import com.main.backend.Utils.Mapper.AuthorMapper;
import com.main.backend.Utils.Mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class AuthorService implements IAuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<AuthorDto> getAll() {
        List<AuthorDto> dtos = new ArrayList<>();
        for (Author author : authorRepository.findAll()){
            dtos.add(AuthorMapper.toAuthorDto(author));
        }
        return dtos;

    }

    @Override
    public AuthorDto getById(UUID id) {
        return authorRepository.findById(id).map(AuthorMapper::toAuthorDto).orElse(null);
    }

    @Override
    public AuthorDto save(CreateUpdateAuthorDto input) {
        Author author = AuthorMapper.toAuthor(input);
        return AuthorMapper.toAuthorDto(authorRepository.save(author));
    }

    @Override
    public AuthorDto update(UUID id, CreateUpdateAuthorDto input) {
        Author author = authorRepository.findById(id).orElse(null);
        if (author != null){
            author.setFirstName(input.getFirstName());
            author.setSurName(input.getSurName());
            return AuthorMapper.toAuthorDto(authorRepository.save(author));
        }
        return null;
    }

    @Override
    public void delete(UUID id) {
        authorRepository.deleteById(id);
    }
}
