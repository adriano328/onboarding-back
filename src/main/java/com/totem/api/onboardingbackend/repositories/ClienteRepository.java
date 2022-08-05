package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.Enum.ClienteSituacaoEnum;
import com.totem.api.onboardingbackend.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("SELECT cl FROM Cliente cl "
            + "WHERE (LOWER(cl.nomeRazao) like CONCAT('%', LOWER(:nomeRazao), '%') OR :nomeRazao IS NULL) "
            + "AND (:situacao IS NULL OR cl.situacao = :situacao)")
    List<Cliente>findByFilters(@Param("nomeRazao") String nomeRazao,
                               @Param("situacao")ClienteSituacaoEnum situacao);

}
