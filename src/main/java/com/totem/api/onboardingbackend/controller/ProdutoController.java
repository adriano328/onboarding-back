package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.Enum.ProdutoSituacaoEnum;
import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.domain.Produto;
import com.totem.api.onboardingbackend.service.produto.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/{id}")
    ResponseEntity<Produto> getById(@PathVariable Integer id){
        return ResponseEntity.ok(produtoService.getById(id));
    }

    @GetMapping()
    public List<Produto> listar(Pageable pageable,
                                @RequestParam(required = false) String nome,
                                @RequestParam(required = false)ProdutoSituacaoEnum situacao,
                                @RequestParam(required = false)Categoria categoria){
        var response = this.produtoService.findByFilters(nome, situacao, categoria);
        return response;
    }

    @PostMapping()
    ResponseEntity<Produto> save(@RequestBody Produto produto){
        var x = produtoService.save(produto);
        return ResponseEntity.ok(x);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        produtoService.delete(id);
    }

    @PutMapping("{id}")
    ResponseEntity<Produto> update(@PathVariable Integer id, @RequestBody Produto produto){
        return ResponseEntity.ok(produtoService.update(produto, id));
    }



}
