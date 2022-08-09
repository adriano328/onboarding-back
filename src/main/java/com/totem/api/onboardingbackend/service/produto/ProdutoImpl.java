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
    public Produto update(Produto produto, Integer id) {
        Produto produtoUpdate = getById(id);
        produtoUpdate.setId(id);
        produtoUpdate.setNome(produto.getNome());
        produtoUpdate.setSituacao(produto.getSituacao());
        produtoUpdate.setCategoria(produto.getCategoria());
        return produtoRepository.save(produtoUpdate);
    }


    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }


    @Override
    public List<Produto> findByFilters(String nome, ProdutoSituacaoEnum situacao, String categoria) {
        var produtos = this.produtoRepository.findByFilters(nome, situacao, categoria);
        return produtos;
    }

}
