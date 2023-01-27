package com.mangesh.smoothieapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "smootheis")
public class Smoothie {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
