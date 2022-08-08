package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.domain.Endereco;
import com.totem.api.onboardingbackend.service.endereco.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/endereco")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @PostMapping()
    ResponseEntity<Endereco> save(@RequestBody Endereco endereco){
        return ResponseEntity.ok(enderecoService.save(endereco));
    }

    @GetMapping("/{id}")
    ResponseEntity<Endereco> getById(@PathVariable Integer id){
        return ResponseEntity.ok(enderecoService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        enderecoService.delete(id);
    }

    @GetMapping("/lista-endereco")
    public List<Endereco> listar(){
        return enderecoService.findAll();
    }

    @PutMapping()
    ResponseEntity<Endereco>update(@RequestBody Endereco endereco){
        return ResponseEntity.ok(enderecoService.update(endereco));
    }




}
