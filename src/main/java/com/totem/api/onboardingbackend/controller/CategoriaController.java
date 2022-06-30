package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.service.categoria.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categoria")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping()
    ResponseEntity<Categoria> save(@Valid @RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.save(categoria));
    }

    @GetMapping("/{id}")
    ResponseEntity<Categoria> getById(@PathVariable Integer id){
        return ResponseEntity.ok(categoriaService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        categoriaService.delete(id);
    }

    @PutMapping()
    ResponseEntity<Categoria> update(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.update(categoria));
    }

    @GetMapping("/lista-categoria")
    public List<Categoria> listar(){
        return categoriaService.findAll();
    }


    @GetMapping("/listar-por-nome")
    ResponseEntity<List<Categoria>> listarPorNome(@RequestParam("nome") String nome){
        return ResponseEntity.ok().body(categoriaService.findCategoriaByName(nome));
    }
}


