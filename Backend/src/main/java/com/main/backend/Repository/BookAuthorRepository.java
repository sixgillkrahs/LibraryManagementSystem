package com.main.backend.Repository;

import com.main.backend.Domain.Model.Books.BookAuthor;
import com.main.backend.Domain.Model.Books.BookAuthorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BookAuthorRepository extends JpaRepository<BookAuthor, BookAuthorId>{
}
