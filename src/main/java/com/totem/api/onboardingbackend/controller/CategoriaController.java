package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.Enum.CategoriaSituacaoEnum;
import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.service.categoria.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categoria")
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

    @PutMapping("{id}")
    ResponseEntity<Categoria> update(@PathVariable Integer id, @RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.update(id, categoria));
    }

    @GetMapping
    public List<Categoria> listar(Pageable pageable,
                                  @RequestParam(required = false) String nome,
                                  @RequestParam (required = false) CategoriaSituacaoEnum situacao ){
        var response = this.categoriaService.findByFilters(nome, situacao);
        return  response;
    }







}


