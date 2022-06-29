package com.totem.api.onboardingbackend.service.produto;

import com.totem.api.onboardingbackend.domain.Produto;
import com.totem.api.onboardingbackend.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoImpl implements ProdutoService{

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public Produto save(Produto produto) {

        return produtoRepository.save(produto);
    }

    @Override
    public Produto getById(Integer id) {
        return produtoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Produto não localizado"));
    }

    @Override
    public void delete(Integer id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public Produto update(Produto produto) {

        return produtoRepository.save(produto);
    }
}
