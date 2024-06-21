package com.main.backend.Domain.Model.Books;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
@Table(name = "book_author")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookAuthor {
    @Id
    @Column(name = "book_id")
    private UUID bookId;
    @Column(name = "author_id")
    private UUID authorId;
}
