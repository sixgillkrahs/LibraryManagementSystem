package com.main.backend.Domain.Model.Books;


import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookAuthorId implements Serializable {
    public UUID userId;
    public UUID roleId;
}
