package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.domain.Produto;
import com.totem.api.onboardingbackend.service.produto.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping()
    ResponseEntity<Produto> save(@RequestBody Produto produto){
        return ResponseEntity.ok(produtoService.save(produto));
    }

    @GetMapping("/{id}")
    ResponseEntity<Produto> getById(@PathVariable Integer id){
        return ResponseEntity.ok(produtoService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        produtoService.delete(id);
    }

    @PutMapping()
    ResponseEntity<Produto> update(@RequestBody Produto produto){
        return ResponseEntity.ok(produtoService.update(produto));
    }



}
