package com.main.backend.Repository;

import com.main.backend.Domain.Model.Books.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, UUID> {
}
