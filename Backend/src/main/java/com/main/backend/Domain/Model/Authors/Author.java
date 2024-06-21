package com.main.backend.Domain.Model.Authors;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "sur_name")
    private String surName;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
}
