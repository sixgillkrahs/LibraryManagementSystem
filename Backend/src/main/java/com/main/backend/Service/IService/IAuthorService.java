package com.main.backend.Service.IService;

import com.main.backend.Domain.Dto.Authors.AuthorDto;
import com.main.backend.Domain.Dto.Authors.CreateUpdateAuthorDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IAuthorService {

    public List<AuthorDto> getAll();
    public AuthorDto getById(UUID id);
    public AuthorDto save(CreateUpdateAuthorDto input);
    public AuthorDto update(UUID id, CreateUpdateAuthorDto input);
    public void delete(UUID id);
}
