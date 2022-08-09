package com.totem.api.onboardingbackend.service.produto;

import com.totem.api.onboardingbackend.Enum.CategoriaSituacaoEnum;
import com.totem.api.onboardingbackend.Enum.ProdutoSituacaoEnum;
import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.domain.Cliente;
import com.totem.api.onboardingbackend.domain.Produto;
import com.totem.api.onboardingbackend.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService {

    Produto save(Produto produto);

    Produto getById(Integer id);

    void delete (Integer id);

    Produto update(Produto produto, Integer id);

    List<Produto> findAll();

    List<Produto> findByFilters(String nome, ProdutoSituacaoEnum situacao, String categoria);

}
