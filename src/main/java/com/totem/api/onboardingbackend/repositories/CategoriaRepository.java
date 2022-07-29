package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    List<Categoria> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT categoria FROM Categoria categoria " +
            "WHERE :nome is null OR categoria.nome LIKE concat('%',:nome, '%')  " +
            "AND :situacao is null OR categoria.situacao = :situacao")
    List<Categoria>findByFilters(@Param("nome") String nome,
                                 @Param("situacao") Boolean situacao);

}
