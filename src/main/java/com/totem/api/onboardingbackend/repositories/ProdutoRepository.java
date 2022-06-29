package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByNomeContainingIgnoreCase(String nome);


}
