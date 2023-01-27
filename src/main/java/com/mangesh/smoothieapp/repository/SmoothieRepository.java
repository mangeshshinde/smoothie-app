package com.mangesh.smoothieapp.repository;

import com.mangesh.smoothieapp.model.Smoothie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmoothieRepository extends JpaRepository<Smoothie, Long> {
}