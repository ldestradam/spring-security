package com.spring.security.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String content;

    private String owner;

}
