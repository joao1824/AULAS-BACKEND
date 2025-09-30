package com.example.exemplo.repository;

import com.example.exemplo.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
}
