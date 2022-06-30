package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.domain.Produto;
import com.totem.api.onboardingbackend.service.produto.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "produto")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
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

    @GetMapping("/lista-produto")
    public List<Produto> listar(){
        return produtoService.findAll();
    }

    @GetMapping("/listar-por-nome")
    ResponseEntity<List<Produto>> listarPorNome(@RequestParam ("nome") String nome){
        return ResponseEntity.ok().body(produtoService.findProdutoByName(nome));
    }

}
