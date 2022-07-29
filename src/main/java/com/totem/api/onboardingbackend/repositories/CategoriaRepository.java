package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.Enum.CategoriaSituacaoEnum;
import com.totem.api.onboardingbackend.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    List<Categoria> findByNomeContainingIgnoreCase(String nome);


    @Query("SELECT c FROM Categoria c "
            + "WHERE (LOWER(c.nome) like CONCAT('%', LOWER(:nome), '%') OR :nome IS NULL) "
            + "AND (:situacao IS NULL OR c.situacao = :situacao)")
    List<Categoria>findByFilters(@Param("nome") String nome,
                                 @Param("situacao") CategoriaSituacaoEnum situacao);

}
