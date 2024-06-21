package com.main.backend.Controller;

import com.main.backend.Domain.Dto.Authors.AuthorDto;
import com.main.backend.Domain.Dto.Authors.CreateUpdateAuthorDto;
import com.main.backend.Service.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorCategory {

    @Autowired
    public AuthorService authorService;

    @GetMapping("/all")
    public List<AuthorDto> getAllAuthors() {
        return authorService.getAll();
    }

    @PostMapping("/save")
    public AuthorDto createAuthor(@RequestBody CreateUpdateAuthorDto input) {
        return authorService.save(input);
    }

    @GetMapping("/{id}")
    public AuthorDto getAuthorById(@PathVariable UUID id) {
        return authorService.getById(id);
    }

    @PutMapping("/{id}")
    public AuthorDto updateAuthor(@PathVariable UUID id, @RequestBody CreateUpdateAuthorDto input) {
        return authorService.update(id, input);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable UUID id) {
        authorService.delete(id);
    }
}
