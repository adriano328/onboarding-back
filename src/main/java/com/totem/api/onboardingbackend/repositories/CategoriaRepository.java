package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    List<Categoria> findByNomeContainingIgnoreCase(String nome);

}
