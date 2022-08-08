package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.Enum.ProdutoSituacaoEnum;
import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT p FROM Produto p "
            + "WHERE (LOWER(p.nome) like CONCAT('%', LOWER(:nome), '%') OR :nome IS NULL) "
            + "AND (:situacao IS NULL OR p.situacao = :situacao)")
    List<Produto>findByFilters(@Param("nome") String nome,
                               @Param("situacao")ProdutoSituacaoEnum situacao);

}
